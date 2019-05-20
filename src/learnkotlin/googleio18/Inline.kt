package learnkotlin.googleio18

fun main() {

    // one loop for each operation are inlined
    val list = listOf(1, 3, 5, 7, 10, 19)
        .map { it.toString() }
        .filter { it.length == 1 }
    println(list)

/*
    var `element$iv$iv`: Any
    var var9: Boolean
    while (var6.hasNext()) {
        `element$iv$iv` = var6.next()
        val it = (`element$iv$iv` as Number).toInt()
        var9 = false
        val var11 = it.toString()               // MAP <<<<<<<<<<<<<<<<<<<<<<<<<<<<
        `destination$iv$iv`.add(var11)
    }

    `$this$filter$iv` = `destination$iv$iv` as List<*> as Iterable<*>
    `$i$f$filter` = false
    `destination$iv$iv` = ArrayList() as Collection<*>
    `$i$f$filterTo` = false
    var6 = `$this$filter$iv`.iterator()

    while (var6.hasNext()) {
        `element$iv$iv` = var6.next()
        val it = `element$iv$iv` as String
        var9 = false
        if (it.length == 1) {                   // FILTER <<<<<<<<<<<<<<<<<<<<<<<<<<<<
            `destination$iv$iv`.add(`element$iv$iv`)
        }
    }
*/

}