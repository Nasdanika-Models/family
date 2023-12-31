# Family

Family model, drawio factory/mappers, node processors and documentation generators to demonstrate the concepts of mapping Drawio diagrams to Ecore models and generating documentation from those models

TODO: Copy Excel and refactor, initial model

Documentation:

Overview of the model, mention Sirius tutorial. 
Goal - visual modeling. Roles - Users - diagrammer and mapper, Specifier, Consumer
Context - Drawio is available, comparison with Sirius. Delivery - Maven build on push, GitHub pages
Two ways of mapping - feature mappers and factories/wires. When to use each and combinations - maximize knowledge passing efficiency, minimize the loss function. Detailed spec of properties, code snippets of feature maps
Examples of markdown doc with diagrams etc - copy from Markdown, spec of ``${representations/...}``
code snippets of wire methods
demos

Adding a new model class or interface - processors, mix-ins. Removing plug-in dependencies from Eclipse project

Visualizations - Drawio, PlantUML, ECharts (including maps?) - why

Sirius links:

* https://wiki.eclipse.org/Sirius/Tutorials/BasicFamily
* https://eclipse.dev/sirius/doc/
* https://eclipse.dev/sirius/doc/user/diagrams/Diagrams.html
* https://eclipse.dev/sirius/doc/specifier/Sirius%20Specifier%20Manual.html
* https://eclipse.dev/sirius/doc/specifier/diagrams/Diagrams.html

## Overview of Drawio

TODO, reference the ecore model, migrage the diagram there and possibly have it here

## Overview of Ecore

TODO, reference the ecore model

## Mapping

### base-uri

This property is used to compute base URI for resolving references such as ``doc-ref`` and ``spec-ref``.
The base URI is resolved relative to the logical parent element up to the document (diagram) URI. 
For pages with links from model element the logical parent the first linking element.
Otherwise, the element's container (``eContainer()``) is the logical parent.

One way to consistently set base URI's is to check "Placeholders" checkbox and then use ``%semantic-id%/`` value for base URI.

### config-prototype

See ``prototype`` below.

### constructor

[Spring Expression Language (SpEL)](https://docs.spring.io/spring-framework/reference/core/expressions.html) expression evaluating to a semantic element.
Takes precedence over ``type``. May return ``null`` - in this case ``type`` would be used to create a semantic element, if specified.

This property can be used, for example, to look-up semantic elements defined elsewhere. 
Say, a list of family members can be defined in an MS Excel workbook, but family relationships in a diagram.

Another example is "progressive enrichment". For example, high-level architecture is defined in some model and a diagram uses 
constructors for already defined architecture elements and ``type`` for their sub-elements. 
This approach can be applied multiple times similar to how Docker images are assembled from layers and base images.

In order to implement lookup constructors, override ``configureConstructorEvaluationContext()`` in sub-classes of ``AbstractDrawioFactory``  or ``createEvaluationContext()`` in Drawio resource factories. 
Set variables from which the constructor expression would obtain semantic elements.

### documentation

Property value is used as documentation for semantic elements which extend ``Documented``. 

### doc-format

Documentation format - ``markdown`` (default), ``text``, or ``html``.
For ``doc-ref`` is derived from the reference extension if not set explicitly.

### doc-ref

Property value is used as a URI to load documentation for semantic elements which extend ``Documented``.
The URI is resolved relative to the ``base-uri``.

### feature-map

A YAML map defining how features of the semantic element and related semantic elements shall be mapped.

The map keys shall be one of the following:

#### container

Mapping specification for the container element in container/contents permutation. Contains one or more of the following sub-keys with each containing a map of feature names to a mapping specification or a list of feature names.

* ``self`` - this element is a container 
* ``other`` - the other element is a container

##### Example

```yaml
container:
  other: elements
  self: 
    elements:
      argument-type: ArchitectureDescriptionElement
      path: 1
```

In the above example ``other`` specifies that this semantic element shall be added to the ``elements`` feature of its container regardless of the containment path length.
``self`` specifies that immediate children of this element (``path: 1``) shall be added to this semantic element ``elements`` collection if they are instances of ``ArchitectureDescriptionElement``

#### contents

Mapping specification for the contents element in container/contents permutation. Contains one or more of the following sub-keys with each containing a map of feature names to a mapping specification or a list of feature names.

* ``self`` - this element is contained by the other 
* ``other`` - the other element is contained by this element

#### end

For connections - mapping specification for the connection end feature to map the connection target semantic element to a feature of the connection semantic element.

#### self

A map of feature names to a [Spring Expression Language (SpEL)](https://docs.spring.io/spring-framework/reference/core/expressions.html) expression or a list of expressions evaluating to the feature value or feature element value.

The expression is evaluated in the context of the source diagram element and has access to the following variables:

* ``value`` - semantic element
* ``registry`` - a map of diagram element to semantic elements

#### source

For connections - mapping specification for the connection source feature to map the connection semantic element to a feature of the connection source semantic element.
If the connection semantic element is ``null``, then the connection source semantic element is used instead.

#### target

For connections - mapping specification for the connection target feature to map the connection semantic element to a feature of the connection target semantic element.
If the connection semantic element is ``null``, then the connection target semantic element is used instead.

#### start

For connections - mapping specification for the connection start feature to map the connection source semantic element to a feature of the connection semantic element.

#### tag-spec

TODO

#### tag-spec-ref

TODO

#### Feature Mapping Specification

Feature mapping value can be either a string or a map. If it is a string it is treated as a singleton map to ``true`` (unconditional mapping).

The below two snippets are equivalent:

```yaml
container:
  other: elements
```

```yaml
container:
  other: 
    elements: true
```

The map value supports the following keys:

##### argument-type

Specifies type of feature elements to be set/added. String as defined in [``type``](#type-1)..
Only instances of the type will be set/added. If absent, the feature type is used.
Argument type can be used to restrict elements to a specific subtype of the feature type.

##### comparator

Comparator is used for "many" features to order elements. 
A comparator instance is created by ``createComparator()`` method which can be overridden in subclasses to provide support for additional comparators.

The following comparators are provided "out of the box":

###### clockwise

Compares elements by their angle relative to the node of the semantic element which holds the many reference. 
In the [Living Beings](https://graph.models.nasdanika.org/demo/living-beings/index.html) demo "Bird", "Fish", and "Bacteria" are compared by their angle to the "Living Beings" with the angle counted from "12 o'clock" - 90 degrees (default).

Feature mapping with comparators of "Bird", "Fish", and "Bacteria" are defined at the connections from "Living Beings" as:

```yaml
source: 
  elements:
    comparator: clockwise
```

To specify the base angle other than 90 degree use the map version of comparator definition where ``clockwise`` is the key mapping to a number or string value. 
The number value is used as the angle value in degrees. The string value is treated as a [Spring Expression Language (SpEL)](https://docs.spring.io/spring-framework/reference/core/expressions.html) expression evaluated in the context of the "parent" node. The expression may evaluate to a number or to a node. In the latter case the result is used to compute the angle between the context node and the result node.

In the Living Beings example "Streptococcus", ..., "Staphyllococcus" are compared relative to the "Bacteria" node with the base angle being the angle between the "Bacteria" node and "Living Beings" node. As such "Streptococcus" is the smallest node and "Staphyllococcus" is the largest. With the default angle of 90 degrees "Lactobacyllus" would be the smallest and "Streptococcus" would be the largest.

Feature mapping with comparators of "Streptococcus", ..., "Staphyllococcus" is defined at connections from "Bacteria" to the respecive genus nodes as:

```yaml
source: 
  elements:
    comparator: 
      clockwise: incoming[0].source
```

``incoming[0]`` evaluates to the connection from "Living Beings" to "Bacteria" and ``source`` evaluates to "Living Beings".

###### counterclockwise

Reverse of ``clockwise``.

###### down-left

Compares nodes by their vertial order first with higher nodes being smaller and then by horizontal order with nodes on the right being smaller.
Nodes are considered vertically equal if they vertically overlap.  

###### down-right

Compares nodes by their vertial order first with higher nodes being smaller and then by horizontal order with nodes on the left being smaller.
Nodes are considered vertically equal if they vertically overlap. 
This comparator can be used for org. charts.

###### expression

A [Spring Expression Language (SpEL)](https://docs.spring.io/spring-framework/reference/core/expressions.html) expression evaluated in the context of the feature element with ``other`` variable referencing the element to compare with. The exmpression has access to ``registry`` variable containing a map of diagram element to semantic elements.

###### flow

If one element is reacheable from the other by traversing connections, then the reacheable element is larger than the source element.
In case of circular references the element with the smaller number of traversals to the other element is considered smaller. 
If elements are not connected they are compared by the fall-back comparator.
This comparator can be used for workflows and [PERT](https://en.wikipedia.org/wiki/Program_evaluation_and_review_technique) charts.

If this comparator's value is a String, then it is uses as a name of the fallback comparator.
In the below example children will be smaller than their parents and siblings will be compared using labels.

```yaml
container:
  self: 
    members:
      argument-type: Person
      comparator: 
        flow: label
```

If the value is a map, then it may have the following keys:

* ``condition`` - A boolean [Spring Expression Language (SpEL)](https://docs.spring.io/spring-framework/reference/core/expressions.html) expression evaluated in the context of a connection being traversed. It may be used to traverse only connections which match the condition. For example, only [transitions](https://flow.models.nasdanika.org/references/eClassifiers/Transition/index.html) between [activities](https://flow.models.nasdanika.org/references/eClassifiers/Activity/index.html) in a process model.
* ``fallback`` - Fallback comparator.

In the below example...

###### key

A [Spring Expression Language (SpEL)](https://docs.spring.io/spring-framework/reference/core/expressions.html) expression evaluated in the context of the feature element. The expression must return a value which would be used for comparison using the natural comparator as explained below.

###### label

Uses diagram element label converted to plain text as a sorting key. String. 
In the [Family mapping demo](https://family.models.nasdanika.org/demos/mapping/index.html) family members are sorted by label using the following feature map definition:

```yaml
container:
  self: 
    members:
      argument-type: Person
      comparator: label
```

###### label-descending

Uses diagram element label converted to plain text as a sorting key to compare in reverse alphabetical order. String.

###### left-down

Compares nodes by their horizontal order first with nodes on the right being smaller and then by vertial order with higher nodes being smaller.
Nodes are considered horizontally equal if they horizontally overlap.  

###### left-up

Compares nodes by their horizontal order first with nodes on the right being smaller and then by vertial order with lower nodes being smaller.
Nodes are considered horizontally equal if they horizontally overlap.  

###### natural

Uses feature element's ``compareTo()`` method for comparable elements. Otherwise compares using hash code. Null are greater than non-nulls.

###### property

Uses diagram element property as a sorting key. Singleton map. For example:

```
property: label
```
###### property-descending

The same as property, but compares in reverse alphabetical order.

###### reverse-flow

Same as ``flow`` but with target nodes being smaller than source nodes.

###### right-down

Compares nodes by their horizontal order first with nodes on the left being smaller and then by vertial order with higher nodes being smaller.
Nodes are considered horizontally equal if they horizontally overlap.  

###### right-up

Compares nodes by their horizontal order first with nodes on the left being smaller and then by vertial order with lower nodes being smaller.
Nodes are considered horizontally equal if they horizontally overlap.  

###### up-left

Compares nodes by their vertial order first with lower nodes being smaller and then by horizontal order with nodes on the right being smaller.
Nodes are considered vertically equal if they vertically overlap.  

###### up-right

Compares nodes by their vertial order first with lower nodes being smaller and then by horizontal order with nodes on the left being smaller.
Nodes are considered vertically equal if they vertically overlap.  

##### condition

A [Spring Expression Language (SpEL)](https://docs.spring.io/spring-framework/reference/core/expressions.html) boolean expression evaluated in the context of the candidate diagram element with the following variables:

* ``value`` - semantic element of the candidate diagram element
*  ``path`` - containment path
* ``registry`` - a map of diagram element to semantic elements

##### path

Either an integer number o or a list of boolean SpEL expressions to match the path. 
If an integer then it is used to match path length as shown in the example below which matches only immediate children

```yaml
container:
  self: 
    elements:
      path: 1
```

If a list, then it matches if the list size is equal to the path length and each element evaluates to true in the context of a given path element.
Expression have acess to ``registry`` variable - a map of diagram element to semantic elements.

##### nop

If ``true``, no mapping is performed, but the chain mapper is not invoked. 
It can be used in scenarios with a default (chained) mapper to prevent the default behavior.

##### expression

A SpEL expression evaluating to a feature value in the context of the diagram element with with the following variables:

* ``value`` - semantic element of the diagram element
*  ``path`` - containment path
* ``registry`` - a map of diagram element to semantic elements

##### greedy

Greedy is used with containment feature and specifies what to do if a candidate object is already contained by another object:

* ``no-children`` - grab the object if it is contained by an ansector of this semantic element. This is the default behavior.
* ``false`` - do not grab
* ``true`` - always grab

##### position

A number specifying the position of the element in the feature collection.

##### type

Type of the feature object to match. String as defined in [``type``](#type-1).
Can be used in ``other`` mappings.

### feature-map-ref

Property value is used as a URI to load feature map YAML specification.
The URI is resolved relative to the ``base-uri``.

### mapping-selector

Mapping selector is used to select one or more semantic elements for feature mapping.
If it is not provided, then the diagram element's semantic element is used for feature mapping.

Mapping selector shall be a YAML document containing either a single string or a list of strings.
The strings are treated as [Spring Expression Language (SpEL)](https://docs.spring.io/spring-framework/reference/core/expressions.html) expression
evaluating to a semantic element to use for feature mapping.

Mapping selectors may be used to associate multiple semantic elements with a diagram element for feature mapping purposes.


### mapping-selector-ref

Property value is used as a URI to load mapping selector YAML.
The URI is resolved relative to the ``base-uri``.

### page-element

``true`` is for true value and any other value or absence of the property is considered false. 
There should be one page element per page. Having more than one may lead to an unpredictable behavior.
For the first top level page the page element becomes a document element.
For pages linked from model elements the page element is logically merged with the linking element.

This allows to define a high-level structure on a top level diagram page, link other pages to the diagram elements and 
refine their definitions. 

If the semantic element of a page element extends ``NamedElement`` then the page name is used as element name if it is not already set
by other means.

### prototype

[Spring Expression Language (SpEL)](https://docs.spring.io/spring-framework/reference/core/expressions.html) expression evaluating to a diagram element.
The semantic element of that diagram element is copied and the copy is used as the semantic element of this diagram element. 
Also, prototype configuration (properties) is applied to this semantic element. 
Protypes can be chained. 

Example: ``getDocument().getModelElementById('6ycP1ahp__4fXEwP3E-2-5')``

Selectors allow to define common configuration in one element and then reuse it in other elements. 
For example, a web server prototype may define an icon and then all web server element would inherit that configuration.

Drawio model classes provide convenience methods for finding diagram elements:

* [Document](https://drawio.models.nasdanika.org/references/eClassifiers/Document/operations.html):
    * ``getModelElementById(String id)``
    * ``getModelElementByProperty(String name, String value)``
    * ``getModelElementsByProperty(String name, String value)``
    * ``getPageById(String id)``
    * ``getPageByName(String name)``
* [Page](https://drawio.models.nasdanika.org/references/eClassifiers/Page/operations.html):
    * ``getModelElementById(String id)``
    * ``getModelElementByProperty(String name, String value)``
    * ``getModelElementsByProperty(String name, String value)``
    * ``getTag(String name)``
* [ModelElement](https://drawio.models.nasdanika.org/references/eClassifiers/ModelElement/operations.html):
    * ``getDocument()``
    * ``getPage()``
* [Root](https://drawio.models.nasdanika.org/references/eClassifiers/Root/operations.html), [Layer](https://drawio.models.nasdanika.org/references/eClassifiers/Layer/operations.html):    
    * ``getModelElementById(String id)``
    * ``getModelElementByProperty(String name, String value)``
    * ``getModelElementsByProperty(String name, String value)``

A prototype must have a semantic element defined using ``constructor``, ``type``, ``selector`` or ``ref-id``. 
If you want to inherit just configuration, but not the semantic element, then use ``config-prototype`` property instead of ``prototype``.

### ref-id

Some identifier to resolve a semantic element. 
You would need to override ``getByRefId()`` method and define what the reference id means in your case.
For example, you may use semantic URI's to lookup elements. Say ``ssn:123-45-6789`` to lookup a person by SSN.

Resource factories treat ref-id's as URI's resolved relative to the diagram resource URI. 
Resolved URI's are then are passed to ``ResourceSet.getEObject(URI uri, true)``.

### selector

[Spring Expression Language (SpEL)](https://docs.spring.io/spring-framework/reference/core/expressions.html) expression evaluating to a diagram element.
The semantic element of that diagram element is used as the semantic element of this diagram element. 

Example: ``getDocument().getModelElementById('6ycP1ahp__4fXEwP3E-2-5')``

Selectors allow to use the same semantic elment on multiple diagrams. 
Drawio model classes provide convenience methods for finding diagram elements:

* [Document](https://drawio.models.nasdanika.org/references/eClassifiers/Document/operations.html):
    * ``getModelElementById(String id)``
    * ``getModelElementByProperty(String name, String value)``
    * ``getModelElementsByProperty(String name, String value)``
    * ``getPageById(String id)``
    * ``getPageByName(String name)``
* [Page](https://drawio.models.nasdanika.org/references/eClassifiers/Page/operations.html):
    * ``getModelElementById(String id)``
    * ``getModelElementByProperty(String name, String value)``
    * ``getModelElementsByProperty(String name, String value)``
    * ``getTag(String name)``
* [ModelElement](https://drawio.models.nasdanika.org/references/eClassifiers/ModelElement/operations.html):
    * ``getDocument()``
    * ``getPage()``
* [Root](https://drawio.models.nasdanika.org/references/eClassifiers/Root/operations.html), [Layer](https://drawio.models.nasdanika.org/references/eClassifiers/Layer/operations.html):    
    * ``getModelElementById(String id)``
    * ``getModelElementByProperty(String name, String value)``
    * ``getModelElementsByProperty(String name, String value)``

### semantic-id

If the semantic element extends ``StringIdentity``, ``semantic-id`` property can be used to specify the ``id`` attribute.
If this property is not provided, then Drawio model element ID is used as a semantic ID.  

### semantic-selector

[Spring Expression Language (SpEL)](https://docs.spring.io/spring-framework/reference/core/expressions.html) expression evaluating to a semantic element.

Semantic selectors are similar to constructors with the following diffences:

* Semantic selectors are evaluated after constructors
* A constructor may evaluate to ``null``, but a semantic selector must eventually evaluate to a non-null value
* A constructor is evaluated once, but a semantic selector maybe evaluated multiple time until it returns a non-null value
* A semantic selector is only evaluated if there isn't a semantic element already

Semantic selectors can be used to evaluate semantic elements using semantic elements of other elements. 
For example, a semantic selector of a child node may need a semantic element of its parent to resolve its own semantic element.

Overide ``configureSemanticSelectorEvaluationContext()`` to provide variables to the evaluator.

### spec

Loads semantic element from the property value YAML using EObjectLoader. 

Example:

```yaml
icon: fas fa-user
```

### spec-ref

Loads semantic element from the property value URI using EObjectLoader. 
The URI is resolved relative to the ``base-uri``.

### top-level-page

Page elements from top level pages are mapped to the document semantic element.
By default a page without incoming links from other pages is considered to be a top level page.
This property allows to override this behavior. 
``true`` value indicates that the page is a top level page. Any other value is treated as ``false``.

### type

Type of the semantic element. Types are looked up in the factory packages in the following way:

* If the value contains a hash (``# ``) then it is treated as a type URI. For example ``ecore://nasdanika.org/models/family#//Man``.
* If the value contains a doc (``.``) then it is treated as a qualified EClass name with EPackage prefix before the dot. For example ``family.Man``.
* Otherwise the value is treated as an unqualified EClass name - EPackages are iterated in the order of their registration and the first found EClass with matching name is used to create a semantic element. 

Type is used to create a semantic element if there is no ``constructor`` or the constructor expression returned ``null``.
A combination of ``constructor`` and ``type`` can be used for mapping in different contexts.
For example, when loading a stand-alone model ``constructor`` would return ``null`` and then ``type`` would be used. 
When the same diagram loaded in the context of a larger model, ``constructor`` may return a semantic element looked up in that larger model.

### Namespaces

It is possible to maintain multiple mappings at a single element using namespace prefixes.
In subclasses of ``AbstractDrawioFactory`` override ``getPropertyNamespace()`` method. 
By default this method returns an empty string which is used as a prefix for the configuration properties.

## Markdown rendering 

Markdown is a filter which renders [Markdown](https://en.wikipedia.org/wiki/Markdown) to HTML. 
It optionally styles it by enclosing into a ``<div class="markdown-body">`` recognized by [github-markdown-css](https://github.com/sindresorhus/github-markdown-css).

The filter also processes markdown which allows to embed diagrams using [fenced code blocks](https://www.markdownguide.org/extended-syntax/#fenced-code-blocks).

Markdown source can be defined in the YAML definition or loaded from an external resource.

[TOC levels=6]

## Inline Markdown

### Single line

```yaml
content-markdown:
  style: true
  source:
    content-text: Hello, *World*!
```

### Multi-line

```yaml
content-markdown:
  style: true
  source:
    content-text: |+2
      Hello, ``Universe``!
```

## Markdown loaded from resource

```yaml
content-markdown:
  style: true
  source:
    content-resource: features/execution-model.md  
```

## Embedded images

Markdown filter allows to embed PNG and JPEG using fenced blocks.

### PNG resource

	```png-resource
	nasdanika-logo.png
	```

Resource location is resolved relative to the model resource containing filter definition.
If the filter model element has a marker, e.g. it was loaded from YAML, then the resource location is resolved to the location of that YAML file
even if the model was saved to, say, XML after that.  

```png-resource
nasdanika-logo.png
```

### JPEG resource

	```jpeg-resource
	my.jpeg
	```

### PNG

	```png
	Base 64 encoded png 
	```
### JPEG

	```jpeg
	Base 64 encoded jpeg
	```

## Embedded diagrams

Markdown filter allows to embed [PlantUML](https://plantuml.com/), [Draw.io](https://www.diagrams.net/), and [Mermaid](https://mermaid-js.github.io/mermaid/#/) diagrams using fenced blocks. Draw.io diagrams can be edited in a desktop editor or [Online editor](https://app.diagrams.net/).

### Draw.io

    ```drawio-resource
    aws.drawio
    ```

Resource location is resolved in the same way as for image files as explained above.

```drawio-resource
aws.drawio
```

### PlantUML

PlantUML diagrams can be defined inline or loaded from resources.

#### Loading from a resource

    ```uml-resource
    sequence.plantuml
    ```

In the above snippet ``uml`` is a dialect supported by PlantUML (see below) and ``sequence.plantuml`` is a resource containing a diagram definition without ``@startuml`` and ``@enduml``.
Resource location is resolved in the same as for image files as explained above.

```uml-resource
sequence.plantuml
```

#### Inline 

The following language specifications (dialects) are supported:

* ``uml`` - for the following diagram types:
    * [Sequence](https://plantuml.com/sequence-diagram), 
    * [Use Case](https://plantuml.com/use-case-diagram), 
    * [Class](https://plantuml.com/class-diagram), 
    * [Activity](https://plantuml.com/activity-diagram-beta), 
    * [Component](https://plantuml.com/component-diagram), 
    * [State](https://plantuml.com/state-diagram), 
    * [Object](https://plantuml.com/object-diagram), 
    * [Deployment](https://plantuml.com/deployment-diagram), 
    * [Timing](https://plantuml.com/timing-diagram), 
    * [Network](https://plantuml.com/nwdiag).
* ``wireframe`` - for [Wireframe diagrams](https://plantuml.com/salt)
* ``gantt`` - for [Gantt diagrams](https://plantuml.com/gantt-diagram)
* ``mindmap`` - for [Mind Maps](https://plantuml.com/mindmap-diagram)
* ``wbs`` - for [Work Breakdown Structures](https://plantuml.com/wbs-diagram)

##### UML
###### Sequence

Fenced block:

	```uml
	Alice -> Bob: Authentication Request
	Bob --> Alice: Authentication Response
	```
	
Diagram:

```uml
Alice -> Bob: Authentication Request
Bob --> Alice: Authentication Response
```

###### Component

Component diagram with links to component pages.


Fenced block:

	```uml
    package Core {
       component Common [[https://docs.nasdanika.org/modules/core/modules/common/index.html]]
    }
    
    package HTML {
       component HTML as html [[https://docs.nasdanika.org/modules/html/modules/html/index.html]]
       [html] ..> [Common]
    }
	```
	
Diagram:

```uml
package Core {
   component Common [[https://docs.nasdanika.org/modules/core/modules/common/index.html]]
}

package HTML {
   component HTML as html [[https://docs.nasdanika.org/modules/html/modules/html/index.html]]
   [html] ..> [Common]
}
```

##### Wireframe

Fenced block:

	```wireframe
	{
	  Just plain text
	  [This is my button]
	  ()  Unchecked radio
	  (X) Checked radio
	  []  Unchecked box
	  [X] Checked box
	  "Enter text here   "
	  ^This is a droplist^
	}
	```


Diagram:

```wireframe
{
  Just plain text
  [This is my button]
  ()  Unchecked radio
  (X) Checked radio
  []  Unchecked box
  [X] Checked box
  "Enter text here   "
  ^This is a droplist^
}
```

##### Gantt

Fenced block:

	```gantt
	[Prototype design] lasts 15 days and links to [[https://docs.nasdanika.org/index.html]]
	[Test prototype] lasts 10 days
	-- All example --
	[Task 1 (1 day)] lasts 1 day
	[T2 (5 days)] lasts 5 days
	[T3 (1 week)] lasts 1 week
	[T4 (1 week and 4 days)] lasts 1 week and 4 days
	[T5 (2 weeks)] lasts 2 weeks
	```

Diagram:

```gantt
[Prototype design] lasts 15 days and links to [[https://docs.nasdanika.org/index.html]]
[Test prototype] lasts 10 days
-- All example --
[Task 1 (1 day)] lasts 1 day
[T2 (5 days)] lasts 5 days
[T3 (1 week)] lasts 1 week
[T4 (1 week and 4 days)] lasts 1 week and 4 days
[T5 (2 weeks)] lasts 2 weeks
```

##### Mind Map

Fenced block:

	```mindmap
	* Debian
	** [[https://ubuntu.com/ Ubuntu]]
	*** Linux Mint
	*** Kubuntu
	*** Lubuntu
	*** KDE Neon
	** LMDE
	** SolydXK
	** SteamOS
	** Raspbian with a very long name
	*** <s>Raspmbc</s> => OSMC
	*** <s>Raspyfi</s> => Volumio
	```

Diagram:

```mindmap
* Debian
** [[https://ubuntu.com/ Ubuntu]]
*** Linux Mint
*** Kubuntu
*** Lubuntu
*** KDE Neon
** LMDE
** SolydXK
** SteamOS
** Raspbian with a very long name
*** <s>Raspmbc</s> => OSMC
*** <s>Raspyfi</s> => Volumio
```

##### WBS

WBS elements can have links. This type of diagram can also be used to display organization structure.

	```wbs
	* [[https://docs.nasdanika.org/index.html Business Process Modelling WBS]]
	** Launch the project
	*** Complete Stakeholder Research
	*** Initial Implementation Plan
	** Design phase
	*** Model of AsIs Processes Completed
	**** Model of AsIs Processes Completed1
	**** Model of AsIs Processes Completed2
	*** Measure AsIs performance metrics
	*** Identify Quick Wins
	** Complete innovate phase
	```

Fenced block:


Diagram:

```wbs
* [[https://docs.nasdanika.org/index.html Business Process Modelling WBS]]
** Launch the project
*** Complete Stakeholder Research
*** Initial Implementation Plan
** Design phase
*** Model of AsIs Processes Completed
**** Model of AsIs Processes Completed1
**** Model of AsIs Processes Completed2
*** Measure AsIs performance metrics
*** Identify Quick Wins
** Complete innovate phase
```

### Mermaid

You can define [Mermaid](https://mermaid-js.github.io/mermaid/#/) diagrams in ``mermaid`` fenced blocks:

  ```mermaid
  flowchart LR
     Alice --> Bob & Chuck --> Deb
  ```

results in this diagram:

```mermaid
flowchart LR
   Alice --> Bob & Chuck --> Deb
```

#### Loading from a resource

It is also possible to load a diagram definition from a resource resolved relative to the model resource:

    ```mermaid-resource
    sequence.mermaid
    ```


## Extensions

* [Table of contents](https://github.com/vsch/flexmark-java/wiki/Table-of-Contents-Extension) - add ``[TOC]`` to the document as explained in the documentation. This extension will create a table of contents from markdown headers. 
* [Footnotes](https://github.com/vsch/flexmark-java/wiki/Footnotes-Extension)
* Strikethrough: ``~~strikethrough~~``-> ~~strikethrough~~ 
* Subscript: ``H~2~O`` -> H~2~0
* Superscript: ``2^5^ = 32`` -> 2^5^ = 32

==========================

# Parking lot

Model development in Eclipse - remove Plug-in dependencies for compilation


Communication including communicating to self - now and in the future, wearing multiple hats (modalities). 
The faintest pen...

There is UML, Sirius, Capella, you name it... but people in enterprises still don't model as it was mentioned on on Eclipse conference (Sirius?). 
So, [if the mountain won't come to Muhammad](https://en.wiktionary.org/wiki/if_the_mountain_won%27t_come_to_Muhammad)

Decision binding to achieve a goal - who, when 
Design space, task space, variation points and their progressive binding. 
A relatively new actor - AI. Is not good at interpreting diagram images, listening to meetings, etc.

Loss function in knowledge sharing - time to capture knowledge, deliver, consume. Expressive power and relevance dimensions. E.g. UML is powerful but not so relevant. Excel might be relevant, but not so powerful.
Graph and PUML generated representations - context diagrams

Roles:

* Diagrammer - creates diagrams possibly without any formal notation and before a model exists
* Modeler - creates a model. A model may be created by analyzing pre-existing diagrams
* Mapper - maps diagrams to models
* Librarian/Publisher - assembles multiple diagrams/models and other data into a holistic body of knowledge. Versions/releases. Levels/layers.
* Consumer - uses the body of knowledge to get the job done. Can be an AI consumer. May use AI to consume - Semantic search, RAG, summarization. 

Activities/steps and design choices 

The same person may play all of the above roles


Multi-mapping with namespaces

