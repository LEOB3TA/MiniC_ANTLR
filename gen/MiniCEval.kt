import kotlin.system.exitProcess

class MiniCEval : MiniCBaseVisitor<Any>() {

    var undefinedVar = HashMap<String, String>()
    var memory = HashMap<String,Number>()

    override fun visitProgram(ctx: MiniCParser.ProgramContext): Any {
        return super.visitProgram(ctx)
    }

    override fun visitSimpleDeclaration(ctx: MiniCParser.SimpleDeclarationContext): Unit {
        undefinedVar[ctx.ID()!!.text] = ctx.TYPE()!!.text
    }

    override fun visitAssignDeclaration(ctx: MiniCParser.AssignDeclarationContext): Unit {
        val id = ctx.ID()!!.text
        if (undefinedVar.containsKey(id)) {
            println("exception can not declare $id two times")
        } //exception cannot declare the same variable 2 times
        val type = ctx.TYPE()!!.text
        var value: Number = this.visit(ctx.getChild(3)!!) as Number
        if (type == "int") {
            memory[id] = value.toInt()
        } else if (type == "double") {
            memory[id] = value.toDouble()
        } else {
          //exception?
        }
    }

    override fun visitStatement(ctx: MiniCParser.StatementContext): Unit {

        if(ctx.text == ";" || ctx.findOperation()!= null) return //operation è lecita ma in uno statement può non essere valutata
        this.visit(ctx.getChild(0)!!)
        return
    }

    override fun visitBlockStatement(ctx: MiniCParser.BlockStatementContext): Unit {
        if(ctx.findStatement().isNotEmpty()){
            for (statement in ctx.findStatement()){
                this.visit(statement)
            }
        }else if(ctx.findDeclaration().isNotEmpty()){
            for (declaration in ctx.findDeclaration()){
                this.visit(declaration)
            }
        }
        return //implement the block scope
    }

    override fun visitIfStatement(ctx: MiniCParser.IfStatementContext): Unit {
        val cond : Number = this.visit(ctx.getChild(2)!!) as Int
        if(cond != 0){
            this.visit(ctx.findStatement()[0])
        }else if (ctx.ELSE() != null){ 
            this.visit(ctx.findStatement()[1])
        }
       return
    }

    override fun visitWhileStatement(ctx: MiniCParser.WhileStatementContext): Unit {
        return //implementazione ricorsiva?? non mi pare molto efficiente
    }

    override fun visitBoolExpr(ctx: MiniCParser.BoolExprContext): Number { //bool cast to int
        return if (ctx.BOOL()!!.text == "true") {
            1 //or another number
        } else {
            0
        }
    }

    override fun visitNumberExpr(ctx: MiniCParser.NumberExprContext): Number {
        return ctx.NUMBER()!!.text.toDouble()
    }

    override fun visitBracketExpr(ctx: MiniCParser.BracketExprContext): Number { //cosa succede se scrivo ()? Succede null pointer exception
        return this.visit(ctx.getChild(1)!!) as Number
    }

    override fun visitAssignExpr(ctx: MiniCParser.AssignExprContext): Number {
        //TODO make this function work
        val id = ctx.ID()!!.text
        if(!undefinedVar.containsKey(id) && !memory.containsKey(id)){
            println("exception $id undeclared")
            exitProcess(123)
            //exception $id undeclared
        }
        val value: Number = this.visit(ctx.getChild(2)!!) as Number
        if (undefinedVar.containsKey(id)) {
            if (undefinedVar[id] == "int") {
                memory[id] = value.toInt()
            } else {
                memory[id] = value.toDouble()
            }
            undefinedVar.remove(id)
        } else if (memory.containsKey(id)) {
            if(memory[id] is Int){
                memory[id] = value.toInt()
            }
            else{
                memory[id] = value.toDouble()
            }
        }else{
            //exception ??
        }
        return value
    }

    override fun visitOperation(ctx: MiniCParser.OperationContext): Number { //non cambiata perchè tanto è da rifare
        var firstOperand : Double = 0.0
        var result : Double =0.0
        var not : Double = 1.0
        if(ctx.ID() == null){
            firstOperand=  this.visit(ctx.findExpression(0)!!) as Double // moltiplicazione
        }else if(memory.containsKey(ctx.ID()!!.text)){
            firstOperand = memory[ctx.ID()!!.text]!!.toDouble()
        }else{
            //exception
            println((ctx.ID()!!.text) + " undefined")
        }
        if(ctx.NOT() != null){
            if(firstOperand>0) firstOperand =0.0
            else firstOperand = 1.0
        }
        if(ctx.OPERATOR() != null){
            val secondOperand : Double
            if(ctx.findOperation()!=null){
                secondOperand = this.visit(ctx.findOperation()!!) as Double
            }else{
                secondOperand = this.visit(ctx.findExpression(1)!!) as Double
            }
            when (ctx.OPERATOR()!!.text) {
                "*" -> result = firstOperand * secondOperand
                "/" -> result = firstOperand / secondOperand
                "%" -> result = firstOperand % secondOperand
                "+" -> result = firstOperand + secondOperand
                "-" -> result = firstOperand - secondOperand
                ">" -> result = if(firstOperand>secondOperand) 1.0; else 0.0
                "<" -> result = if(firstOperand<secondOperand) 1.0; else 0.0
                ">=" -> result = if(firstOperand>=secondOperand) 1.0; else 0.0
                "<=" -> result = if(firstOperand<=secondOperand) 1.0; else 0.0
                "==" -> result = if(firstOperand==secondOperand) 1.0; else 0.0
                "!=" -> result = if(firstOperand!=secondOperand) 1.0; else 0.0
                "&&" -> result = if(firstOperand!=0.0 && secondOperand!=0.0) 1.0;else 0.0
                "||" -> result = if(firstOperand!=0.0 && secondOperand!=0.0) 1.0;else 0.0
            }
        }
        else{
            result=firstOperand
        }
        return result
    }
}