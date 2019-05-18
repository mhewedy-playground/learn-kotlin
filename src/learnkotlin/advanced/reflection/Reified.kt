package learnkotlin.advanced.reflection

inline fun <reified T> myFunction(obj: T) {
    println(T::class)
}

fun main() {
    myFunction("Hello")
}