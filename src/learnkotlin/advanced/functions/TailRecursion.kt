package learnkotlin.advanced.functions

fun factorial(number: Long): Long {
    return when (number) {
        0L, 1L -> 1
        else -> number * factorial(number - 1)
    }
}

tailrec fun factorialTr(number: Long, accumulator: Long = 1): Long {
    return when (number) {
        0L -> accumulator
        else -> factorialTr(number - 1, number * accumulator)
    }
}

fun main() {
//    println(factorial(500000000))
    println(factorialTr(500000000))
}