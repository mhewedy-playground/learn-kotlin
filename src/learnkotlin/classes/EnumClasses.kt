package learnkotlin.classes

enum class Priority(/*it can be `val` as well*/var value: Int) {
    MINOR(-1),
    NORMAL(0),
    MAJOR(1),
    CRITICAL(10)
}

fun main(args: Array<String>) {

    val priority = Priority.NORMAL

    priority.value = 30

    Priority.values().forEach { println("$it, value=${it.value}, ordinal: ${it.ordinal}") }
}