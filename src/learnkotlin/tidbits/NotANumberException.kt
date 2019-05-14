package learnkotlin.tidbits

class NotANumberException : Throwable()

fun checkIsNumber(num: Any) {
    when (num) {
        !is Number -> throw NotANumberException()
    }
}

fun main(args: Array<String>) {

    checkIsNumber(50L)
}