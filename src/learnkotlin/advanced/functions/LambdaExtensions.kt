package learnkotlin.advanced.functions

class Func : (Int) -> Int {     // this is a function class (class extends Function class)
    override fun invoke(x: Int): Int {
        return x
    }
}

class Operator {        // and this is a class that pretends to be a function
    operator fun invoke(x: Int): Int {
        return x
    }
}

fun main() {
    val operator = Operator()
    println(operator(10))

    val func = Func()
    println(func(10))
}
