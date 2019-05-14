package learnkotlin.functional

fun operation(x: Int, y: Int, op: (Int, Int) -> Int) = op(x, y)

object AddObject : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int) = p1 + p2
}

fun main(args: Array<String>) {

    fun add(x: Int, y: Int) = x + y

    // we can pass function reference
    println(operation(10, 20, ::add))

    // we can pass object that implement the function
    println(operation(10, 20, AddObject))

    // we can pass anonymous object that implements the function
    println(operation(10, 20, object : (Int, Int) -> Int {
        override fun invoke(x: Int, y: Int) = x + y

    }))

    // we can pass lambda expression
    println(operation(10, 20, { x, y -> x + y }))

    // we can put the lambda expression outside the parameter braces and surround it with curly brackets
    // if it is the last parameter to the original function
    println(operation(10, 20) { x, y -> x + y })
}