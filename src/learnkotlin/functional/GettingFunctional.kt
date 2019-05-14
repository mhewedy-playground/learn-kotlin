package learnkotlin.functional

fun operation(x: Int, y: Int, op: (Int, Int) -> Int) = op(x, y)

object AddObject : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int) = p1 + p2
}

fun main(args: Array<String>) {

    fun add(x: Int, y: Int) = x + y

    println(operation(10, 20, ::add))

    println(operation(10, 20, { x, y -> x + y }))

    println(operation(10, 20) { x, y -> x + y })

    println(operation(10, 20, AddObject))

    println(operation(10, 20, object : (Int, Int) -> Int {
        override fun invoke(x: Int, y: Int) = x + y

    }))
}