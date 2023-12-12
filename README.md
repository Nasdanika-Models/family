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

