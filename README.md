# MiniC
This is small compiler for a little set of C


# Index
- [How to install](#how-to-install)
- [Usage](#usage)
- [Features](#features)
- [Contribute](#contribute)


# How to install

## Dependencies

You have to install **Java JRE** on your computer

## Instructions

- Download the .jar file for your OS from the release
- In Linux make it executable by:
```bash
chmod +x Mini_ANTLR_Linux_x64.jar
```
- Execute it by double-clicking it, or in alternative you can use:
```bash
java -jar MiniC_ANTLR_<your-version>.jar
```

# Usage

The interface is divided in two part:
- input area -> where you can write your code
- output area -> where the program prints the result of evaluation

First you have to write some code in the input area or open a file with your code via File menu, after that through the Command menu you can choose :
- Check -> check token and grammar
- Evaluate -> after a check, evaluate your code
- Print parse tree -> print the parse tree

The output is written to the output area

You can save your input and your output in a file via the File menu

# Features

### Data type
- int
- double
- bool (true,false) -> are respectively 1 and 0

### Operators:
- '*' -> Times
- '/' -> Divide
- '%' -> Module
- '+' -> Plus
- '-' -> Minus
- '<' -> Less than
- '<=' ->Less equal than
- '>' -> Greater than
- '>=' -> Greater equal then
- '==' -> Equal
- '!=' -> Not equal
- '||' -> Or
- '&&' -> And
- '!' -> Not
- '=' -> Assignment

### Statements:
- if-else
- while
- block ({})

# Contribute
 
 Open a issue or open a pull request
