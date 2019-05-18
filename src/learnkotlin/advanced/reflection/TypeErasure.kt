package learnkotlin.advanced.reflection

fun main() {
    val strings = arrayListOf("one", "two", "three")
    val integers = arrayListOf(1, 3, 5)


    printObject("Hello")
    printObject(strings)
    printObject(setOf<Set<String>>())
}

fun printList(list: List<*>) {
    println(list)
}

fun <T> printObject(obj: T) = when (obj) {
    is Int -> println("this is int")
    is String -> println("this is string")
    is List<*> -> println(obj.joinToString())
    else -> println("undefined")
}