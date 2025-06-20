## To run a java project
navigate to the root of the project
run `javac mainFile.java` to compile the project
run `java mainFile` to run the compiled project with the main file as the entry point

if you run into problems:
- make sure the interpreter is finding the correct root. 
`ctrl + shift + p` will open the command pallete
type `Java: Configure Java Runtime` and go to the sources tab
Each of the projects should have its own root here e.g. `java/1-STRATEGY`. Check the project you're trying to run is added.


For the folder structure to be correct
- you can only have a main file in the root directory as in `1-STRATEGY`, everything else must be in packages unless everything is in the root like `2-OBSERVER-PUSH`