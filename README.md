# MiniC
This is small compiler for a little set of C


# Index
- [How to install](#how-to-install)
- [Usage](#usage)
- [Features](#features)
- [Examples](#examples)
- [Contribute](#contribute)


# How to install

## Dependencies

You have to install **Java JRE** on your computer, the version must be newest than 10

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

First you have to write some code in the input area or open a file with your code via ***File*** menu, after that through the ***Command menu*** you can choose :
- Check input -> check token and grammar
- Start evaluation -> after a check, evaluate your code
- Debug -> after a check, evaluate your code and shows how the memory changes during execution
- Print parse tree -> print the parse tree
- Stop -> stops all running actions

You can use one command at time

The output is written to the Console

The status led indicate if an action is running

You can save your input and your output in a file via the File menu

With ***Help*** menu you can read some info about this project, or you can open this page by clicking help

### Commands details
#### Check input
Check all the input and controls if there are some wrong token or if the grammar is not respected
Prints all the error in the console; if there's no error it prints "ready for evaluation..."

#### Start evaluation
First check the code, if the check is correct evaluate the code, otherwise prints all the parser and lexer error.
If errors are found during the evaluation, the evaluation stops and prints the errors to the console.

#### Debug
The behaviour is the same of "Start evaluation", but in this case, every time the memory changes, prints the memory state in this format:
```bash
after evaluation of: <statement that changes the memory>
undefined var:
level n: {<undefined variable at this level>}
level n+1: {<…>}
……………
memory :
level n: {<inizialized variable at this level>}
level n+1: {<…>}
……………
```
level matches the blocks ({}), more details about the memory inside the docs

#### Print parse tree
First check the code, if the check is correct prints the parse tree, otherwise prints all the parser and lexer error.

#### Stop
This command stop all the running actions.
It can be useful when there are semantic errors in the code; such as an infinite loop


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
- printf -> only for int and double types,  you can insert also boolean value that will be cast to integer, you can only use %d and %f format
- scanf -> only for int and double types, you can insert also boolean value that will be cast to integer, you can only use %d and %f format

# Examples
 ### Example of correct evaluation:
 <img src="https://github.com/LEOB3TA/MiniC_ANTLR/blob/main/images/example1.png" width="550" height="650"/>
 
 ### Example of evaluation error:
 <img src="https://github.com/LEOB3TA/MiniC_ANTLR/blob/main/images/exampleEvaluationError.png" width="550" height="650"/>
  
 ### Example of lexer error:
 <img src="https://github.com/LEOB3TA/MiniC_ANTLR/blob/main/images/exampleLexerError.png" width="550" height="650"/>
 
 ### Example of parser error:
 <img src="https://github.com/LEOB3TA/MiniC_ANTLR/blob/main/images/exampleParserError.png" width="550" height="650"/>
 
 ### Example of correct check:
 <img src="https://github.com/LEOB3TA/MiniC_ANTLR/blob/main/images/exampleReady.png" width="550" height="650"/>
 
 ### Example of parse tree:
 <img src="https://github.com/LEOB3TA/MiniC_ANTLR/blob/main/images/exampleParseTree.png" width="550" height="650"/>
 
 
 
 

# Contribute
 
 Open a issue or open a pull request
