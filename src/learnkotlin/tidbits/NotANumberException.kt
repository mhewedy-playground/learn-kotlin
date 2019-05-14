package learnkotlin.tidbits

class NotANumberException(message: String) : Throwable(message)

fun checkIsNumber(num: Any) {
    when (num) {
        !is Number -> throw NotANumberException("Is not a number")
    }
}

fun main(args: Array<String>) {

    try {
        checkIsNumber("40")
    } catch (e: NotANumberException) {
        println("${e.message}")
    }
}