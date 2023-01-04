import tornadofx.App
import tornadofx.launch
import view.MiniCView

class MiniCApp : App(MiniCView::class)

fun main(args: Array<String>) {
    launch<MiniCApp>(args)
}