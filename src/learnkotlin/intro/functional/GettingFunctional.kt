package learnkotlin.intro.functional

fun operation(x: Int, y: Int, op: (Int, Int) -> Int) = op(x, y) // we can use op.invoke(x, y)

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

    // we might declare a variable of type lambda, and then we should specify the type
    val op: (Int, Int) -> Int = { x, y -> x + y }
    println(operation(10, 20, op))

    // we can put the lambda expression outside the parameter braces and surround it with curly brackets
    // if it is the last parameter to the original function
    println(operation(10, 20) { x, y -> x + y })


    // we can create an anonymous function as well
    println(operation(10, 20, fun(x: Int, y: Int) = x * y))

    // ----------------

    fun route(path: String, vararg actions: (String) -> String): String {
        var initPath = path
        for (action in actions) {
            initPath = action(initPath)
        }
        return initPath
    }

    fun bananaBox(str: String) = route(str, { "($it)" }, { "[$it]" })

    println(bananaBox("ABC"))

    // -------------------

    class MyObj

    fun MyObj.myRun(fn: (Any?) -> Any?) {
        fn(this)
    }

    MyObj().myRun { println("$it") }
}