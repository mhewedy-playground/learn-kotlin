package learnkotlin.intro.stdlib

fun main() {

    with("Hello") {
        println(length)
        println(toUpperCase())
    }


    val run: Int = "hello".run { this.length }

    val apply: String = "hello".apply { this.length }

    val let: Int = "hello".let { it.length }

    val also: String = "hello".also { it.length }
}