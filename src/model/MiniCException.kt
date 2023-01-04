package model

class DoubleDeclarationException : Throwable{
    constructor(message: String?) :super(message)
    constructor() : super("you cannot declare a variable more than once")
}

class UndefinedVariableException : Throwable{
    constructor(message: String?) : super(message)
    constructor() : super("the variable is not defined")
}

class ArithmeticException : Throwable{
    constructor(message: String?) : super(message)
    constructor() : super("operation is not correct")
}

