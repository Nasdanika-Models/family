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

### page-element

``true`` is for true value and any other value or absence of the property is considered false. 
For top level pages, page elements are added to the document semantic element.
For pages linked from model elements the page element is logically merged with the linking element.

This allows to define a high-level structure on a top level diagram page, link other pages to the diagram elements and 
refine their definitions. 

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

