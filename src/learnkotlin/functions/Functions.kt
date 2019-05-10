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

fun sum(x: Int, y: Int, z: Int = 0) = x + y + z


fun printDetails(name: String, email: String = "", phone: String) {
    println("name $name, email: $email, phone: $phone")
}

fun main(args: Array<String>) {

    println(hello())
    try {
        throwsAnException()
    } catch (ex: Exception) {
    }

    sum(10, 20)
    sum(10, 20, 30)
    sum(y = 1, x = 30)
    sum(z = 100, y = 1, x = 30)

    printDetails("Ali", phone = "9665 123")
}