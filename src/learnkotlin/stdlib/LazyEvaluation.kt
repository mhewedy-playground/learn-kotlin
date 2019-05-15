package learnkotlin.stdlib

fun main() {

    val range = 1..100_000_000

    // eager evaluation, each function (map, filter...) operates on the current object (list, range, etc)
    // and return a new object
    range.map { it + it }
        .filter { it < 700 }
        .forEach { println(it) }

    // sequence here like streams in Java 8
    // it is lazy, means each each function (map, filter, ...) does not immediately operate
    // on the current object (list, range, etc...) but instead return a new Sequence
    // that holds that operation to be executed when triggered by a final operation (like forEach)
    range.asSequence()
        .map { it + it }
        .filter { it < 700 }
        .forEach { println(it) }
}