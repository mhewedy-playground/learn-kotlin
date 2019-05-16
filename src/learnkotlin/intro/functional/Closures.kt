package learnkotlin.intro.functional


fun unaryOperation(x: Int, op: (Int) -> Int): Int = op(x)

fun testClosures() {
    for (number in 1..30) {
        val result = unaryOperation(10) {
            it + number
        }
        println("number=$number, result=$result")
    }
}

fun returnsClosure(): (Int) -> Int {
    var number = 10
    return { it * ++number }
    //    return fun(x: Int) = number + x // same as above line
}

fun main() {
//    testClosures()

    val closure = returnsClosure()
    println(closure(10))    // 10 * (++10) = 10 * 11 = 110
    println(closure(10))    // 10 * (++11) = 10 * 12 = 120

    // each function has its own local variables, so [number] for this new fun call is reset to 10
    println(returnsClosure()(10))    // 10 * (++10) = 10 * 12 = 110
}