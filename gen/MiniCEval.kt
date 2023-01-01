import java.util.Vector

class MiniCEval() : MiniCBaseVisitor<Any>() {

    private var undefinedVarBlock: Vector<HashMap<String, String>>
    private var memoryBlock: Vector<HashMap<String, Number>>
    private var blockLevel: Int


    init {
        undefinedVarBlock = Vector()
        memoryBlock = Vector()
        blockLevel = 0
        undefinedVarBlock.add(HashMap())
        memoryBlock.add(HashMap())
    }

    private fun insideUndefinedVar(key: String): Boolean {
        for (undefinedVar in undefinedVarBlock) {
            if (undefinedVar.containsKey(key)) {
                return true
            }
        }
        return false
    }

    private fun insideMemory(key: String): Boolean {
        for (memory in memoryBlock) {
            if (memory.containsKey(key)) {
                return true
            }
        }
        return false
    }

    private fun getFromUndefinedVar(key: String): Pair<String, Int>? {
        for (undefinedVar in undefinedVarBlock) {
            if (undefinedVar.containsKey(key)) {
                return Pair(undefinedVar[key]!!, undefinedVarBlock.indexOf(undefinedVar))
            }
        }
        return null
    }


    private fun getFromMemory(key: String): Pair<Number, Int>? {
        for (memory in memoryBlock) {
            if (memory.containsKey(key)) {
                return Pair(memory[key]!!, memoryBlock.indexOf(memory))
            }
        }
        return null
    }

    // ---------------------------------------------------------------------------------------//
    //use for test only
    fun insertInMemoryAtCurrentLevel(key: String, value: Number) {
        memoryBlock[blockLevel][key] = value
    }

    fun insertInUndefinedAtCurrentLevel(key: String, type: String) {
        undefinedVarBlock[blockLevel][key] = type
    }

    fun insertInMemoryAtNextLevel(key: String, value: Number) {
        memoryBlock.add(HashMap())
        memoryBlock[blockLevel+1][key] = value
    }

    fun insertInUndefinedAtNextLevel(key: String, type: String) {
        undefinedVarBlock.add(HashMap())
        undefinedVarBlock[blockLevel+1][key] = type
    }

    fun purgeAllMemory(){
        memoryBlock.removeAllElements()
        undefinedVarBlock.removeAllElements()
    }

    // ---------------------------------------------------------------------------------------//
    //stop test use

    private fun removeFromUndefinedVar(key: String): String? {
        for (undefinedVar in undefinedVarBlock) {
            return undefinedVar.remove(key)
        }
        return null
    }

    fun getMemoryBlock(): Vector<HashMap<String, Number>> {
        return this.memoryBlock
    }

    fun getUndefinedVarBlock(): Vector<HashMap<String, String>> {
        return this.undefinedVarBlock
    }


    override fun visitAssign(ctx: MiniCParser.AssignContext): Double {
        val id = ctx.ID()!!.text
        val value = this.visit(ctx.getChild(2)!!) as Double
        if (insideUndefinedVar(id)) {
            val type = getFromUndefinedVar(id)!!.first
            val level = getFromUndefinedVar(id)!!.second
            if (type == "int") {
                memoryBlock[level][id] = value.toInt()
            } else {
                memoryBlock[level][id] = value

            }
            removeFromUndefinedVar(id)
        } else if (insideMemory(id)) {
            val number = getFromMemory(id)!!.first
            val level = getFromMemory(id)!!.second
            if (number is Int) {
                memoryBlock[level][id] = value.toInt()
            } else {
                memoryBlock[level][id] = value
            }
        } else {
            print("undefined variable $id")
            return 0.0
        }
        return value

    }

    override fun visitProgram(ctx: MiniCParser.ProgramContext): Any {
        return super.visitProgram(ctx)

    }

    override fun visitSimpleDeclaration(ctx: MiniCParser.SimpleDeclarationContext) {
        undefinedVarBlock[blockLevel][ctx.ID()!!.text] = ctx.TYPE()!!.text
    }

    override fun visitAssignDeclaration(ctx: MiniCParser.AssignDeclarationContext) {
        val id = ctx.ID()!!.text
        if (insideUndefinedVar(id)) {
            throw DoubleDeclarationException("you cannot declare $id more than once")
        }
        val type = ctx.TYPE()!!.text
        val value: Number = this.visit(ctx.findExpression()!!) as Number
        when(type){
            "int" -> memoryBlock[blockLevel][id] = value.toInt()
            "double" ->  memoryBlock[blockLevel][id] = value.toDouble()
            else -> throw InvalidTypeException()
        }
    }

    override fun visitStatement(ctx: MiniCParser.StatementContext) {
        this.visit(ctx.getChild(0)!!)
    }

    override fun visitBlockStatement(ctx: MiniCParser.BlockStatementContext) {
        blockLevel++
        undefinedVarBlock.add(HashMap())
        memoryBlock.add(HashMap())
        if (ctx.findDeclaration().isNotEmpty()) {
            for (declaration in ctx.findDeclaration()) {
                this.visit(declaration)
            }
        }
        if (ctx.findStatement().isNotEmpty()) {
            for (statement in ctx.findStatement()) {
                this.visit(statement)
            }
        }
        memoryBlock.removeAt(blockLevel)
        undefinedVarBlock.removeAt(blockLevel)
        blockLevel--
    }

    override fun visitIfStatement(ctx: MiniCParser.IfStatementContext) { //non so per quale motivo non fa l'else
        blockLevel++
        undefinedVarBlock.add(HashMap())
        memoryBlock.add(HashMap())
        val cond: Number = this.visit(ctx.getChild(2)!!) as Double
        if (cond != 0.0) {
            this.visit(ctx.findStatement()[0])
        } else if (ctx.ELSE() != null) {
            this.visit(ctx.findStatement()[1])
        }
        memoryBlock.removeAt(blockLevel)
        undefinedVarBlock.removeAt(blockLevel)
        blockLevel--
    }

    override fun visitWhileStatement(ctx: MiniCParser.WhileStatementContext) {
        blockLevel++
        undefinedVarBlock.add(HashMap())
        memoryBlock.add(HashMap())
        while (this.visit(ctx.getChild(2)!!) as Number != 0.0) {
            this.visit(ctx.findStatement()!!)
        }
        memoryBlock.removeAt(blockLevel)
        undefinedVarBlock.removeAt(blockLevel)
        blockLevel--
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
                "!=" -> res = if (res != this.visit(e3) as Double) 1.0 else 0.0
            }
        }
        return res
    }

    override fun visitE3(ctx: MiniCParser.E3Context): Double {
        var res : Double
        if(ctx.findE4().size == 1 && ctx.op==null) {
            res = this.visit(ctx.findE4(0)!!) as Double
        }
        else if (ctx.findE4().size == 1 && ctx.op != null){
            res = 0.0
            when (ctx.op!!.text) {
                "+" -> res += this.visit(ctx.findE4(0)!!) as Double
                "-" -> res -= this.visit(ctx.findE4(0)!!) as Double
            }
        }
        else {
            res = this.visit(ctx.findE4(0)!!) as Double
            for (e4 in ctx.findE4().drop(1)) {
                when (ctx.op!!.text) {
                    "+" -> res += this.visit(e4) as Double
                    "-" -> res -= this.visit(e4) as Double
                }
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
            if (this.visit(ctx.findE5()!!) == 0.0) 1.0 else 0.0
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
            if (insideMemory(ctx.ID()!!.text)) {
                val level = getFromMemory(ctx.ID()!!.text)!!.second
                return memoryBlock[level][ctx.ID()!!.text]!!.toDouble()
            } else {
                throw UndefinedVariableException("${ctx.ID()} is undefined")
            }
        }
        return this.visit(ctx.findExpression()!!) as Double
    }
}



