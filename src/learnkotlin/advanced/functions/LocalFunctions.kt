package learnkotlin.advanced.functions

fun foo(fooParam: String) {

    var x = 10

    fun bar(barParam: String) {
        println(fooParam)
        println(barParam)
        x += 5
        println(x)
    }

    println(x)
    bar("XYZ")
    println(x)      // 15
}

fun main() {
    foo("ABC")
}