package learnkotlin.classes

enum class Priority(val value: Int) {
    MINOR(-1),
    NORMAL(0),
    MAJOR(1),
    CRITICAL(10)
}

fun main(args: Array<String>) {

    val priority = Priority.NORMAL

    println(priority)
    println(priority.value)

}