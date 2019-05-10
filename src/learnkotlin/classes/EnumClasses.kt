package learnkotlin.classes

enum class Priority(/*it can be `val` as well*/var value: Int) {
    MINOR(-1) {
        override fun size() = 100
    },
    NORMAL(0) {
        override fun size() = 200
    },
    MAJOR(1) {
        override fun size() = 300
    },
    CRITICAL(10) {
        override fun size() = 400
    };

    override fun toString(): String {
        return "(name=$name, value=$value, ordinal=$ordinal), size: ${size()}"
    }

    abstract fun size(): Int
}

fun main(args: Array<String>) {

    val priority = Priority.NORMAL

    priority.value = 30

    // values() returns an Array, which we can use forEach on
    /*Priority.values().forEach { println(it) }*/

    // the values() returns an array which is an iterable (has the method iterator())
    for (priority in Priority.values()) {
        println(priority)
    }
}