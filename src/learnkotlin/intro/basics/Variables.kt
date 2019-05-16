package learnkotlin.intro.basics


var age = 30
    get() = field * 2
    set(value) {
        if (value < 0) throw Exception("less than zero")
        field = value
    }

fun main(args: Array<String>) {

    val streetNumber = 10
    val streetName = "High Street"

    println(streetNumber)
    println(streetName)

    try {
        age = -1
    } catch (ex: Exception) {
        println(ex)
    }

}