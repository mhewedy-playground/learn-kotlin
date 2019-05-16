package learnkotlin.intro.stdlib

// Trying to implement the Sequence lazy evaluation

open class Sequence<T>(private val iter: Iterator<T>) : Iterable<T> {

    override fun iterator(): Iterator<T> {
        return iter;
    }

    fun map(op: (T) -> (T)): Sequence<T> {
        return MapSequence(iter, op)
    }

    fun filter(op: (T) -> (Boolean)): Sequence<T> {
        return FilterSequence(iter, op)
    }

    fun foreach(op: (T) -> (Unit)) {
        for (element in iterator()) {
            op(element)
        }
    }
}

private class MapSequence<T>(private val iter: Iterator<T>, private val op: (T) -> (T)) :
    Iterable<T>, Sequence<T>(iter) {

    override fun iterator(): Iterator<T> {

        return object : Iterator<T> {
            override fun hasNext(): Boolean {
                return iter.hasNext()
            }

            override fun next(): T {
                return op(iter.next())
            }
        }
    }
}

private class FilterSequence<T>(private val iter: Iterator<T>, private val op: (T) -> (Boolean)) :
    Iterable<T>, Sequence<T>(iter) {

    override fun iterator(): Iterator<T> {

        return object : Iterator<T> {
            override fun hasNext(): Boolean {
                return iter.hasNext()
            }

            override fun next(): T {
                val next = iter.next()
                val shouldBypassNext = op(next)
                // todo if shouldBypassNext is false, then we need to bypass this element
                return next
            }
        }
    }
}

fun main() {

    val seq = Sequence((1..100_000_000).iterator())

    seq.map { it + it }
        .filter { it < 2 }
        .foreach { println(it) }
}