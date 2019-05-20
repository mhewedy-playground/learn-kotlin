package learnkotlin.googleio18

fun String.getFirstWord(separator: String = " "): String {
    return if (indexOf(separator) < 0) this else split(separator)[0]
}

fun main() {
    println("Hello World".getFirstWord())
}