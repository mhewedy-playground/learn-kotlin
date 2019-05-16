package learnkotlin.advanced.functions

infix fun String.shouldBeEqualTo(other: String) = this == other

fun main() {
    val output = "Hello"

    println(output shouldBeEqualTo "Hello")
}