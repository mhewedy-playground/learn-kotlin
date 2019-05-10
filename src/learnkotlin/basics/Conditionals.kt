package learnkotlin.basics

fun main(args: Array<String>) {

    // if is an expression

    val grade = "90".toInt()
    val feedback = if (grade >= 90) "Excellent" else "Not so excellent"
    println(feedback)
}