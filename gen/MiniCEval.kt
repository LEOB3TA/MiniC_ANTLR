class MiniCEval() : MiniCBaseVisitor<Any>() {

    private var undefinedVar : HashMap<String, String> //these two are for global variable
    private var memory : HashMap<String,Number>


    init {
        memory = HashMap<String, Number>()
        undefinedVar = HashMap<String, String>()
    }

    fun getMemory(): HashMap<String, Number> {
        return this.memory
    }

    fun getUndefinedVar(): HashMap<String, String> {
        return this.undefinedVar
    }


    override fun visitAssign(ctx: MiniCParser.AssignContext): Double {
        val id = ctx.ID()!!.text
        val value = this.visit(ctx.getChild(2)!!) as Double
        if (undefinedVar.containsKey(id)) {
            if (undefinedVar[id] == "int") {
                memory[id] = value.toInt()
                undefinedVar.remove(id)
            } else {
                memory[id] = value
                undefinedVar.remove(id)
            }
        } else if (memory.containsKey(id)) {
            if (memory[id] is Int) {
                memory[id] = value.toInt()
            } else {
                memory[id] = value
            }
        }else {
            //exception
            return 0.0
        }
        return value

    }

    override fun visitProgram(ctx: MiniCParser.ProgramContext): Any {
        return super.visitProgram(ctx)

    }

    override fun visitSimpleDeclaration(ctx: MiniCParser.SimpleDeclarationContext) {
        undefinedVar[ctx.ID()!!.text] = ctx.TYPE()!!.text
    }

    override fun visitAssignDeclaration(ctx: MiniCParser.AssignDeclarationContext) {
        val id = ctx.ID()!!.text
        if (undefinedVar.containsKey(id)) {
            println("exception can not declare $id two times")
        } //exception cannot declare the same variable 2 times
        val type = ctx.TYPE()!!.text
        val value: Number = this.visit(ctx.findExpression()!!) as Number
        if (type == "int") {
            memory[id] = value.toInt()
        } else if (type == "double") {
            memory[id] = value.toDouble()
        } else {
            //exception?
        }
    }

    override fun visitStatement(ctx: MiniCParser.StatementContext) {
        if (ctx.text == ";") return
        this.visit(ctx.getChild(0)!!)
        return
    }

    override fun visitBlockStatement(ctx: MiniCParser.BlockStatementContext) {
        if (ctx.findStatement().isNotEmpty()) {
            for (statement in ctx.findStatement()) {
                this.visit(statement)
            }
        } else if (ctx.findDeclaration().isNotEmpty()) {
            for (declaration in ctx.findDeclaration()) {
                this.visit(declaration)
            }
        }
        return //implement the block scope
    }

    override fun visitIfStatement(ctx: MiniCParser.IfStatementContext) {
        val cond: Number = this.visit(ctx.getChild(2)!!) as Int
        if (cond != 0) {
            this.visit(ctx.findStatement()[0])
        } else if (ctx.ELSE() != null) {
            this.visit(ctx.findStatement()[1])
        }
        return
    }

    override fun visitWhileStatement(ctx: MiniCParser.WhileStatementContext) {
        while(this.visit(ctx.getChild(2)!!) as Number != 0.0){
            this.visit(ctx.findStatement()!!)
            print(ctx.getChild(2)!!.text)
        }
    }

    override fun visitExpression(ctx: MiniCParser.ExpressionContext): Double {
        var res = this.visit(ctx.findE1(0)!!) as Double
        for (e2 in ctx.findE1().drop(1)) {
            res = if (res != 0.0 || this.visit(e2) as Double != 0.0) 1.0 else 0.0
        }
        return res
    }

    override fun visitE1(ctx: MiniCParser.E1Context): Double {
        var res = this.visit(ctx.findE2(0)!!) as Double
        for (e2 in ctx.findE2().drop(1)) {
            res = if (res != 0.0 && this.visit(e2) as Double != 0.0) 1.0 else 0.0
        }
        return res
    }

    override fun visitE2(ctx: MiniCParser.E2Context): Double {
        var res = this.visit(ctx.findE3(0)!!) as Double
        for (e3 in ctx.findE3().drop(1)) {
            when (ctx.op!!.text) {
                "<" -> res = if (res < this.visit(e3) as Double) 1.0 else 0.0
                "<=" -> res = if (res <= this.visit(e3) as Double) 1.0 else 0.0
                ">" -> res = if (res > this.visit(e3) as Double) 1.0 else 0.0
                ">=" -> res = if (res >= this.visit(e3) as Double) 1.0 else 0.0
                "==" -> res = if (res == this.visit(e3) as Double) 1.0 else 0.0
                "!=" -> res = if (res <= this.visit(e3) as Double) 1.0 else 0.0
            }
        }
        return res
    }

    override fun visitE3(ctx: MiniCParser.E3Context): Double {
        var res = this.visit(ctx.findE4(0)!!) as Double
        for (e4 in ctx.findE4().drop(1)) {
            when (ctx.op!!.text) {
                "+" -> res += this.visit(e4) as Double
                "-" -> res -= this.visit(e4) as Double
            }
        }
        return res
    }

    override fun visitE4(ctx: MiniCParser.E4Context): Double {
        var res = this.visit(ctx.findE5(0)!!) as Double
        for (e5 in ctx.findE5().drop(1)) {
            when (ctx.op!!.text) {
                "*" -> res *= this.visit(e5) as Double
                "/" -> if (this.visit(e5) == 0) println("exception cannot divide by 0") else res /= this.visit(e5) as Double
                "%" -> res %= this.visit(e5) as Double
            }
        }
        return res
    }

    override fun visitE5(ctx: MiniCParser.E5Context): Double {
        return if (ctx.NOT() != null) {
            if (this.visit(ctx.findE6()!!) == 0.0) 1.0 else 0.0
        } else {
            this.visit(ctx.findE6()!!) as Double
        }
    }

    override fun visitE6(ctx: MiniCParser.E6Context): Double {
        if (ctx.BOOL() != null) {
            return if (ctx.BOOL()!!.text == "true") 1.0 else 0.0
        } else if (ctx.NUMBER() != null) {
            return ctx.NUMBER()!!.text.toDouble()
        } else if (ctx.ID() != null) {
            if (memory.containsKey(ctx.ID()!!.text)) {
                return memory[ctx.ID()!!.text]!!.toDouble()
            } else {
                println("exception " + ctx.ID()!!.text + " is undefined")//exception
            }
        }
        return this.visit(ctx.findExpression()!!) as Double
    }
}



