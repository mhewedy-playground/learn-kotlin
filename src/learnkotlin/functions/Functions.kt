package learnkotlin.functions


fun hello(): Unit {
    println("Hello World!")
}

fun throwsAnException(): Nothing {
    throw Exception("An exception")
}

fun add(x: Int, y: Int): Int {
    return x * y
}

/*
// Invalid, the default return type in case of function block is Unit, which is not the case here
fun add(x: Int, y: Int) {
    return x + y
}
*/

fun addV2(x: Int, y: Int) = x + y


fun main(args: Array<String>) {

    println(hello())
    try {
        throwsAnException()
    } catch (ex: Exception) {
    }
}