package learnkotlin.basics

fun main(args: Array<String>) {

    for (index in 1..100) {
        print("$index, ")
    }
    println()

    for (l in 10.rangeTo(40L)) {
        print("$l, ")
    }
    println()

    val aRange: LongRange = 10..30L
    println(aRange.first)
    println(aRange.step)

    aRange.forEach { print("$it, ") }
    println()

    // for is not an expression
    /*  // compilation error
    val x = for (i in 1..10) {
        i * i
    }
    */

    println("range is an iterable and can be converted to list and we can get an iterator from the range")

    val range: IntRange = 1.rangeTo(100)
    val iterable: Iterable<Int> = 1.rangeTo(100)

    val list = range.toList()       // it iterates over the range to create a list (expensive)
    val iterator: IntIterator = range.iterator()

    println(range)
    println(iterable)
    println(list)
    println(iterator)

    // -------------------

    for (i in 100 downTo 10 step 10) {
        println(i)
    }

    // For loop work over any Iterables (classes that has the iterator() function),
    // not only Ranges, but lists and arrays as well
    for (c in arrayOf("Cairo", "Riyadh", "Dubai")) {
        println(c)
    }

}