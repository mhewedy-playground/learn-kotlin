package learnkotlin.advanced.functions

fun innerFunctionCanReturnItself() {

    (fun() {
        //println("executing Self-invoking function")

        return  // returns from the local function
    }())

    println("hello yes inside: innerFunctionCanReturnItself")
}

fun lambdaCannotReturnItself_OnlyTheSurroundingFunction() {
    1.rangeTo(10).forEach {
        it * it
        return      // will return from the outer function
    }
    println("hello yes inside: lambdaCannotReturnItself_OnlyTheSurroundingFunction")
}

fun returnFromLambda() {

    fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
        for (element in this) action(element)
    }

    1.rangeTo(10).myForEach {
        it * it
        return@myForEach  // return from the myForEach block
    }
    println("hello yes inside: returnFromLambda")
}

fun main() {

    innerFunctionCanReturnItself()
    lambdaCannotReturnItself_OnlyTheSurroundingFunction()
    returnFromLambda()

    outer@ for (i in arrayOf(1, 3, 5)) {
        for (j in listOf(5, 6, 7)) {
            if (i % j == 0) {
                continue@outer
            }
        }
    }
}