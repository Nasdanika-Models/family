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