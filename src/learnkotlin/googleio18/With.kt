package learnkotlin.googleio18

fun main() {

    val sb = with(StringBuilder()) {
        append("s")
        append("b")
    }
    println(sb)

    val sb2 = StringBuilder().apply {
        append("s")
        append("b")
    }
    println(sb2)

}