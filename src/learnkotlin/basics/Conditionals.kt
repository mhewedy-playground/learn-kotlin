package learnkotlin.basics

fun main(args: Array<String>) {

    // if is an expression

    val grade = "90".toInt()
    val feedback: Any = if (grade >= 90) {
        println("Excellent")
        30
    } else "Not so excellent"

    println(feedback)
}