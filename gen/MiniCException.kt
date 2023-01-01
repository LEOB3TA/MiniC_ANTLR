class MiniCException : Throwable{
    constructor(message: String?) : super(message)
    constructor() : super("error while valuation")
}

class DoubleDeclarationException : Throwable{
    constructor(message: String?) :super(message)
    constructor() : super("you cannot declare a variable more than once")
}

class InvalidTypeException() : Throwable("you can only use int or double type")

class UndefinedVariableException : Throwable{
    constructor(message: String?) : super(message)
    constructor() : super("the variable is not defined")
}

//class InvalidOperatorException() : Throwable("you can only use the operators: +, -, *, /, %, <, <=, >, >=, ==, !=, ||, ! ")

