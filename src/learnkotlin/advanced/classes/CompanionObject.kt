package learnkotlin.advanced.classes

class Log() {

    private var filename: String = ""

    fun log(message: String) {
        // write to [filename]
    }

    companion object {
        @JvmStatic
        fun createFileLog(filename: String) = Log(filename)
    }

    constructor(filename: String) : this() {
        this.filename = filename
    }
}

fun main() {
    val fileLog = Log.createFileLog("app.log")
}