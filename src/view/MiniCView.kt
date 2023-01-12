package view

import controller.MiniCController
import javafx.scene.control.Alert
import javafx.scene.image.Image
import javafx.stage.FileChooser
import tornadofx.*
import java.io.File
import kotlin.system.exitProcess

class MiniCView : View("MiniC") {
    private val controller = MiniCController()
    override val root = vbox {
        minWidth = 800.0
        minHeight = 800.0
        menubar {
            menu("File") {
                item("Open", "Shortcut+O") {
                    action {
                        val file = chooseFile(
                            "Select file to open", arrayOf(FileChooser.ExtensionFilter("Text Files", "*.c", "*.txt")),
                            File(System.getProperty("user.dir")), FileChooserMode.Single
                        )
                        if (file.isNotEmpty())
                            controller.outputText.value = ""
                        controller.inputText.value = file[0].readText()
                    }
                }
                item("Save Input", "Shortcut+L") {
                    action {
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
                            arrayOf(FileChooser.ExtensionFilter("Text Files", "*.c", "*.txt")),
                            File(System.getProperty("user.dir")),
                            FileChooserMode.Save
                        )
                        if (file.isNotEmpty())
                            file[0].writeText(controller.outputText.value)
                    }
                }
                item("Quit", "Shortcut+Q").action {
                    exitProcess(0)
                }
            }
            menu("Command") {
                item("Check input", "Shortcut+I").action {
                    controller.check()
                }
                item("Start evalutation", "Shortcut+S").action {
                    controller.evaluate()
                }
                item("Print parse tree", "Shortcut+P").action {
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
                }
                item("GitHub").action { /* TODO hostServices.showDocument("pagina github") */ }
                item("About").action {
                    alert(
                        Alert.AlertType.INFORMATION,
                        "MiniC",
                        "small compiler for a little set of C\n inspired by Fcc by Marco Cova\n Author: Leonardo Focardi\n Date: Jan 2023"
                    )
                }
            }
        }

        label("input area:")
        textarea {
            this.bind(controller.inputText)
            fitToParentSize()
        }
        label("output area")
        textarea {
            this.bind(controller.outputText)
            fitToParentSize()
            isEditable = false
        }
    }

    init {
        setStageIcon(Image("MiniC.png"))
    }

}

