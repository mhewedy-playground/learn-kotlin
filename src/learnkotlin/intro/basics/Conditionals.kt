package learnkotlin.intro.basics

fun main(args: Array<String>) {

    // if is an expression

    val grade = "90".toInt()
    val feedback: Any = if (grade >= 90) {
        println("Excellent")
        100
    } else "Not so excellent"

    println(feedback)

    /// ----- when
    println("practicing when ... ****")

    // when also is an expression
    val result = when (feedback) {
        100 -> {
            println("Good $feedback")
            1
        }
        "Excellent" -> {
            println(feedback.toString().toUpperCase())
            2
        }
        is String -> println("it is a string")
        is Int -> println("it is an Int")
        else -> "Nothing"
    }

    println(result)
}