package learnkotlin.intro.tidbits

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


    val cc2 = listOf(Pair("Cairo", "Egypt"), "Riyadh" to "Saudi Arabia")
    for ((cap, country) in cc2) {
        println("$cap, $country")
    }

    val cc3 = mapOf(Pair("Cairo", "Egypt"), "Riyadh" to "Saudi Arabia")
    for ((s, s1) in cc3) {
        println("$s, $s1")
    }

    data class SomeDataClass(val prop1: String, val prop2: String, val prop3: Int)

    val someDataClassList = arrayListOf(SomeDataClass("1", "2", 3))
    for ((prop1, _ /*ignoring the prop2*/, prop3) in someDataClassList) {
        println("$prop1, $prop3")
    }

    // anything can be on the righthand side of the destructuring declaration as long as
    // it provides the appropriate componentN function, see:
    class NonDataClass {
        operator fun component1() = 1
        operator fun component2() = 2
        operator fun component3() = 3
    }
    val (non1, non2, non3) = NonDataClass()
    println("$non1, $non2, $non3")
}