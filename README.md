# BobblePermutation
## Bobble AI Assingment

# Welcome User
_This document will walk you through the project_
*  The src folder contains the source files
      1  Main.java   -containing The complete code for programme
      1  Main.class  -bytecode which is generated after compiling the source code
      1  Manifest.MF -contains the Main class which is used when converting to jar file to make executable
        //The command to create jar is " jar -cvfm Main.jar Manifest.MF Main.class "

* The out folder contains
    1 Main.jar --output of the command used earlier to create jar file
    1 stub.sh  --A shell script to execute java in linux by creating .run file
    1  //The command to create run is " cat stub.sh Main.jar > Main.run && chmod +x Main.run "


* Input.csv is the Mock data file


## To compile in linux 
    1 Open terminal in src directory and use the following commands
    1 javac Main.java
    1 java Main filename.csv

# To directly execute the precompiled binary
    1 copy Main.run to directory with csv file and enter the following command
    1 ./Main.run <filename>.csv
