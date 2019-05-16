package learnkotlin.intro.tidbits

class NotANumberException(message: String) : Throwable(message)

fun checkIsNumber(num: Any) {
    when (num) {
        !is Number -> throw NotANumberException("Is not a number")
    }
}

fun main(args: Array<String>) {

    val result = try {
        checkIsNumber("40")
        40 + 40
    } catch (e: NotANumberException) {
        println("${e.message}")
    }finally {
        -1
    }

    println(result) // will print Kotlin.Unit cause the expression above throws an exception
    // ... and the finally block's value is ignored ... only the try block or the catch block values are considered.
}