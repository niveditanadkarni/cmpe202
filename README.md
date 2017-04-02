# cmpe202
UML Parser
In this project, will be applying what learned about UML by creating a Parser which converts Java Source Code into a UML Class Diagram. 
Also, in this project, will be applying "Personal Kanban" to manage your tasks.


Requirements:

The programming language, tools, sdk, libraries that you chose to use is entirely up to you. 
The parser must be executable on the command line with the following format:
umlparser <source folder> <output file name>
<source folder> is a folder name where all the .java source files will be
<output file name> is the name of the output image file you program will generate ( .jpg, .png or .pdf format)
All the Java source files will be in the "default" package.  That is, there will be no sub-directories in the source folder.
You must register for a "free" account on https://waffle.io/  (Links to an external site.)and maintain a weekly update of your Kanban Board. 
The content of Board is up to you to plan, but you must track your weekly count of number of cards "completed" and "in-progress" and calculate wait and cycle times.  This can be done by simply taking a "snapshot" of your board for submission with clearly labeled "calculated numbers"

Hints for Parser:

Default Package: All Java source files will be in the "default" package.  That is, there will be only one directory (i.e. no subdirectories)
Dependencies & Uses Relationships for Interfaces Only:  Do not include dependencies in output UML diagram except in the cases of "interfaces/uses"
Class Declarations with optional Extends and Implements: Make sure to include proper notation for inheritance and interface implementations.  
Only Include Public Methods (ignore private, package and protected scope)
Only Include Private and Public Attributes (ignore package and protected scope)
Java Setters and Getters:  Must Support also Java Style Public Attributes as "setters and getters"
Must Include Types for Attributes, Parameters and Return types on Methods
Classifier vs Attributes Compartment:  If there is a Java source file, then there should be a "UML Class" on the Diagram for it.  That is, if there is no Java source file for a class and the class is part of an instance variable, put the class/property in the attribute compartment
Interfaces - Implements and Uses Notation:  Show Interfaces along with Clients of Interfaces (as dependencies). 
Notes and Exclusions:

Static and Abstract Notation:  Static and Abstract notation in UML are usually denoted as "underline" and "italic", but rarely used in practice.  Parsing this is not a requirement for this project.
Relationships Between Interfaces:  Although conceptually possible in UML, relationships between Interfaces (i.e. inheritance, dependencies) are rarely thought of in practice and generally bad practice.  As such, this project does not expect parser to detect these situations.  Focus your work on the relationships and dependencies from Classes to Interfaces.
For Additional Pointers on UML Notation, see lecture notes and http://www.uml-diagrams.org/class-reference.html (Links to an external site.) 

UML Parser: A Java code parser which takes Java code file as input and gives the UML class diagram as the output based on the code.

UMLGraph: UMLGraph is an open source code that can be used for the drawing of UML class and sequence diagrams and the reverse engineering of class diagrams from Java source code.

UML Class diagram: In Software Engineering, a class diagram in the Unified Modeling Language (UML) is a structure diagram that describes the system's classes, attributes, methods, and the relationships among objects.

JavaParser:http://javaparser.org/
