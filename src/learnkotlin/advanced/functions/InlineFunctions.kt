package learnkotlin.advanced.functions

inline fun nOp(x: Int) {        // redundant
    println("x is $x")
}

inline fun operation(op: () -> Unit): Unit {
    println("before call op")
    op()
    println("after call op")
}

inline fun op(op: () -> Unit) {
    op()
    throw Exception("some exception")
}

fun main() {
    operation {
        println("in the op function")
    }

    nOp(10)

    op {}       // inline function body goes up
}