package view

import controller.MiniCController
import javafx.application.Platform
import javafx.concurrent.Task
import javafx.geometry.Orientation
import javafx.scene.control.Alert
import javafx.scene.control.TextArea
import javafx.scene.image.Image
import javafx.scene.input.KeyCode
import javafx.scene.input.KeyEvent
import javafx.scene.text.Font
import javafx.scene.text.FontWeight
import javafx.stage.FileChooser
import tornadofx.*
import java.io.*
import kotlin.system.exitProcess


class MiniCView : View("MiniC") {
    var pipedInputStream = PipedInputStream()
    var pipedOutputStream = PipedOutputStream(pipedInputStream)
    var printStream = PrintStream(pipedOutputStream)
    var pipedInputStream1 = PipedInputStream()
    var pipedOutputStream1 = PipedOutputStream(pipedInputStream1)
    var pause = false

    private val controller = MiniCController()
    init {
        System.setIn(pipedInputStream1)
        System.setOut(printStream)
        setStageIcon(Image("MiniC.png"))
    }



    override val root = vbox {
        controller.start()
        minWidth = 800.0
        minHeight = 800.0
        menubar {
            menu("File") {
                item("Open", "Shortcut+O") {
                    action {
                        (scene.lookup("#output")as TextArea).isEditable=false
                        val file = chooseFile(
                            "Select file to open", arrayOf(FileChooser.ExtensionFilter("Text Files", "*.c", "*.txt")),
                            File(System.getProperty("user.dir")), FileChooserMode.Single
                        )
                        if (file.isNotEmpty()) {
                            controller.inputText.value = file[0].readText()
                        }
                    }
                }
                item("Save Input", "Shortcut+L") {
                    action {
                        (scene.lookup("#output")as TextArea).isEditable=false
                        val file = chooseFile(
                            "Select where to save the input",
                            arrayOf(FileChooser.ExtensionFilter("Text Files", "*.c", "*.txt")),
                            File(System.getProperty("user.dir")),
                            FileChooserMode.Save
                        )
                        if (file.isNotEmpty())
                            file[0].writeText(controller.inputText.value)
                    }
                }
                item("Save Output", "Shortcut+K") {
                    action {
                        val file = chooseFile(
                            "Select where to save the output",
                            arrayOf(FileChooser.ExtensionFilter("Text Files", "*.txt")),
                            File(System.getProperty("user.dir")),
                            FileChooserMode.Save
                        )
                        if (file.isNotEmpty())
                            file[0].writeText( (scene.lookup("#output")as TextArea).text)
                    }
                }
                item("Quit", "Shortcut+Q").action {
                    exitProcess(0)
                }
            }
            menu("Command") {
                item("Check input", "Shortcut+I").action {
                    (scene.lookup("#output")as TextArea).isEditable=false
                    (scene.lookup("#output")as TextArea).text=""
                    controller.check()
                }
                item("Start evalutation", "Shortcut+S").action {
                    (scene.lookup("#output")as TextArea).isEditable=true
                    (scene.lookup("#output")as TextArea).text=""
                    controller.evaluate()
                }
                item("Debug", "Shortcut+D").action {
                    (scene.lookup("#output")as TextArea).isEditable=true
                    (scene.lookup("#output")as TextArea).text=""
                    controller.debug()
                }
                item("Print parse tree", "Shortcut+P").action {
                    (scene.lookup("#output")as TextArea).isEditable=false
                    (scene.lookup("#output")as TextArea).text=""
                    controller.printParseTree()
                }
            }
            menu("Help") {
                item("Help").action {
                    alert(
                        Alert.AlertType.INFORMATION,
                        "Help",
                        "Open a issue on Github or send me an email at:\n leonardo.focardi@studio.unibo.it"
                    )
                    hostServices.showDocument("https://github.com/LEOB3TA/MiniC_ANTLR")
                }
                item("About").action {
                    alert(
                        Alert.AlertType.INFORMATION,
                        "MiniC",
                        "small compiler for a little set of C\n inspired by Fcc by Marco Cova\n Author: Leonardo Focardi\n Date: Jan 2023"
                    )
                }
            }
        }
        splitpane {
            orientation = Orientation.VERTICAL
            fitToParentSize()
            vbox {
                label {
                    text="Input area"
                    font= Font.font("system",FontWeight.EXTRA_BOLD,15.0)
                }
                textarea {
                    font= Font.font("monospace", FontWeight.BOLD,13.0)
                    this.bind(controller.inputText)
                    fitToParentSize()
                }
            }
            vbox {
                label{text="Console"
                    font= Font.font("system",FontWeight.EXTRA_BOLD,15.0)
                }
                textarea {
                    id="output"
                    font= Font.font("monospace", FontWeight.BOLD,13.0)
                    fitToParentSize()
                    isEditable = false
                    val task = object : Task<Unit>() {
                        override fun call() {
                            while (!isCancelled) {
                                val buffer = ByteArray(1024)
                                while(pipedInputStream.available()==0){
                                    //wait
                                }
                                val read = pipedInputStream.read(buffer)
                                val text = String(buffer, 0, read)
                                Platform.runLater {
                                    if (!pause) {
                                        pause = true
                                        this@textarea.appendText(text)
                                        pause = false
                                    }
                                }
                            }
                        }
                    }
                    val thread = Thread(task)
                    thread.isDaemon = true
                    thread.start()
                    this.addEventHandler(KeyEvent.KEY_PRESSED) {
                        if (it.code == KeyCode.ENTER) {
                            var list = this.text.split("\n")
                            var last = list[list.size - 1] + "\n"
                            if (!pause && last.matches(Regex("\\w*\\n"))) {
                                pause = true
                                try {
                                    pipedOutputStream1.write(last.toByteArray())
                                } catch (e: IOException) {
                                    e.printStackTrace()
                                }
                                pause = false
                            }
                        }
                    }
                }
            }
        }
    }
}

