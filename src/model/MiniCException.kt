package model

class DoubleDeclarationException : Throwable{
    constructor(message: String?) :super(message)
    constructor() : super("you cannot declare a variable more than once")
}

class UndefinedVariableException : Throwable{
    constructor(message: String?) : super(message)
    constructor() : super("the variable is not defined")
}

class NotInizializedVariableException : Throwable{
    constructor(message: String?) : super(message)
    constructor() : super("the variable is not inizialized")
}


class MismatchedTypeException : Throwable{
    constructor(message: String?) : super(message)
    constructor() : super("Type mismatch in scanf")
}

class BadFormatException : Throwable{
    constructor(message: String?) : super(message)
    constructor() : super("The format of your input is not correct")
}


class ArithmeticException : Throwable{
    constructor(message: String?) : super(message)
    constructor() : super("operation is not correct")
}



