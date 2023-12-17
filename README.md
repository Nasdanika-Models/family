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
Takes precedence over ``type``. 

This property can be used, for example, to look-up semantic elements defined elsewhere. 
Say, a list of family members can be defined in an MS Excel workbook, but family relationships in a diagram.

Another example is "progressive enrichment". For example, high-level architecture is defined in some model and a diagram uses 
constructors for already defined architecture elements and ``type`` for their sub-elements. 
This approach can be applied multiple times similar to how Docker images are assembled from layers and base images.

In order to implement lookup constructors, override ``configureConstructorEvaluationContext()`` in sub-classes of ``AbstractDrawioFactory`` and 
set variables from which the constructor expression would obtain semantic elements.

### documentation

Property value is used as documentation for semantic elements which extend ``Documented``. 

### doc-format

Documentation format - ``markdown`` (default), ``text``, or ``html``.

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

##### comparator

Comparator is used for "many" features to order elements. 
A comparator instance is created by ``createComparator()`` method which can be overridden in subclasses to provide support for additional comparators.

The following comparators are provided "out of the box":

###### clockwise

TODO

###### counterclockwise

TODO

###### down-left

TODO 

###### down-right

TODO

###### expression

A [Spring Expression Language (SpEL)](https://docs.spring.io/spring-framework/reference/core/expressions.html) expression evaluated in the context of the feature element with ``other`` variable referencing the element to compare with. The exmpression has access to ``registry`` variable containing a map of diagram element to semantic elements.

###### key

A [Spring Expression Language (SpEL)](https://docs.spring.io/spring-framework/reference/core/expressions.html) expression evaluated in the context of the feature element. The expression must return a value which would be used for comparison using the natural comparator as explained below.

###### label

Uses diagram element label converted to plain text as a sorting key. String.

###### label-descending

Uses diagram element label converted to plain text as a sorting key to compare in reverse alphabetical order. String.

###### left-down

TODO 

###### left-up

TODO 

###### natural

Uses feature element's ``compareTo()`` method for comparable elements. Otherwise compares using hash code. Null are greater than non-nulls.

###### property

Uses diagram element property as a sorting key. Singleton map. For example:

```
property: label
```
###### property-descending

The same as property, but compares in reverse alphabetical order.

###### right-down

TODO

###### right-up

TODO 

###### up-left

TODO 

###### up-right

TODO

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

Element type to match. If not specified, then feature's type is used as default.


The mappinng specification can be either a string or a map. Strings are trea

feature self other container, ...

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
    * ``getPageById(String id)``
    * ``getPageByName(String name)``
* [Page](https://drawio.models.nasdanika.org/references/eClassifiers/Page/operations.html):
    * ``getModelElementById(String id)``
* [ModelElement](https://drawio.models.nasdanika.org/references/eClassifiers/ModelElement/operations.html):
    * ``getDocument()``
    * ``getPage()``
    * ``getModelElementById(String id)``

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
    * ``getPageById(String id)``
    * ``getPageByName(String name)``
* [Page](https://drawio.models.nasdanika.org/references/eClassifiers/Page/operations.html):
    * ``getModelElementById(String id)``
* [ModelElement](https://drawio.models.nasdanika.org/references/eClassifiers/ModelElement/operations.html):
    * ``getDocument()``
    * ``getPage()``
    * ``getModelElementById(String id)``

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

### Namespaces

It is possible to maintain multiple mappings at a single element using namespace prefixes.
In subclasses of ``AbstractDrawioFactory`` override ``getPropertyNamespace()`` method. 
By default this method returns an empty string which is used as a prefix for the configuration properties.

## Markdown rendering 

TODO - adapt from Markdown documentation - embedding diagrams, etc.

===

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

