package learnkotlin.advanced.functions

fun op(x: Int, op: (Int) -> Int) = op(x)

fun fx(x1: Int): (Int) -> (Int) -> Int {
    return fun(x2): (Int) -> Int {
        return fun(x3): Int {
            return x1 * x2 * x3
        }
    }
}

fun main() {
    val output = op(10, fun(x): Int {
        return if (x < 10) {
            0
        } else {
            x * x
        }
    })

    println(output)

    val f1: (Int) -> (Int) -> Int = fx(10)
    val f2: (Int) -> Int = f1(10)
    val result: Int = f2(10)
    println(result)

    println(fx(10)(10)(10))

}