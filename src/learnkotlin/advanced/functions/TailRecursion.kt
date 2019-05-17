package learnkotlin.advanced.functions

fun factorial(number: Int): Int {
    return when (number) {
        0, 1 -> 1
        else -> number * factorial(number - 1)
    }
}

tailrec fun factorialTr(number: Int, accumulator: Int = 1): Int {
    return when (number) {
        0 -> accumulator
        else -> factorialTr(number - 1, number * accumulator)
    }
}

fun main() {
//    println(factorial(500000000))
    println(factorialTr(500000000))
}