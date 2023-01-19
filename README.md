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

- Download the .jar file from the release
- In Linux make it executable by:
```bash
chmod +x Mini_ANTLR.jar
```
- Execute it by double-clicking it, or in alternative you can use:
```bash
java -jar MiniC_ANTLR.jar
```

# Usage

The interface is divided in two parts:
- Input area -> where you can write your code
- Console -> where the program prints the output

First you have to write some code in the input area or open a file with your code via File menu, after that through the Command menu you can choose :
- Check -> check token and grammar
- Evaluate -> after a check, evaluate your code
- Debug -> after a check, evaluate your code and shows how the memory changes during execution
- Print parse tree -> print the parse tree

The output is written to the Console

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
- printf -> only for int and double types,  you can insert also boolean value that will be cast to integer
- scanf -> only for int and double types, you can insert also boolean value that will be cast to integer

# Contribute
 
 Open a issue or open a pull request
