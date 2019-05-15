package learnkotlin.stdlib

fun main() {

    val list: ArrayList<String> = ArrayList<String>()

    val l = mutableListOf<String>() // `arrayListOf` is a mutable list as well
    l += "10"   // append
    val l2 = listOf("a", "b")
    // l2 += "10"  // cannot append on immutable list

    val l3 = mutableListOf("2", "1")

    println(list.javaClass)
    println(l.javaClass)
    println(l2.javaClass)
    println(l3.javaClass)

//    mutableMapOf<>()

    val citiesMap = hashMapOf(
        "Cairo" to "Egypt",
        "London".to("UK"),
        Pair("Riaydh", "KSA")
    )
    println(citiesMap)

    val intArrayOf = intArrayOf(1, 2, 6, 7)
    val arrayOf = arrayOf(1, 2, 3)

    println("intArrayOf[0].javaClass = ${intArrayOf[0].javaClass}")
    println("arrayOf[0].javaClass = ${arrayOf[0].javaClass}")

}