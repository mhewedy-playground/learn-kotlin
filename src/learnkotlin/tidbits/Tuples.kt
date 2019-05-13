package learnkotlin.tidbits

fun capitalAndPopulation(): Pair<String, Long> {
    return Pair("Cairo", 15_000_000)
}

fun capitalAndPopulation2(): Pair<String, Long> {
    return "cairo" to 15_000_000        // can declare Pair using to function
}

data class Location(val x: Int, val y: Int)

fun getLocation() = Location(10, 20)

fun main(args: Array<String>) {

    val cairoPopulation = capitalAndPopulation()
    println(cairoPopulation)
    println(
        "cairoPopulation.first ${cairoPopulation.first}, " +
                "cairoPopulation.component2() ${cairoPopulation.component2()}"
    )

    val (city, population) = capitalAndPopulation() // decomposition works for Tuples
    println("city=$city, population=$population")

    val (a, b, c) = Triple(1, 3, 5)
    println("a=$a, b=$b, c=$c")

    val (x, y) = getLocation()  // decomposition works for data classes too
    println("x=$x, y=$y")

    val location = getLocation()
    println(location.component1()) // componentN() is part of data classes

    val (xx, _, yy) = Triple(1, 2, 3)
    val (xx1, _, yy2) = Triple("a", 4.6, 3) // use underscore to ignore decomposition output
}