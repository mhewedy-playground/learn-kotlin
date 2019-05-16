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
    1.rangeTo(10).forEach {
        it * it
        return@forEach  // return from the forEach block
    }
    println("hello yes inside: returnFromLambda")
}

fun main() {

    innerFunctionCanReturnItself()
    lambdaCannotReturnItself_OnlyTheSurroundingFunction()
    returnFromLambda()
}