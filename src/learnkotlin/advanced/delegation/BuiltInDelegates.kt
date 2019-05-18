package learnkotlin.advanced.delegation

import kotlin.properties.Delegates.observable
import kotlin.properties.Delegates.vetoable


var myVariable by observable(10) { p, o, n ->
    println("${p.name} was $o and now become $n")
}

/*
// use this to write some logic in the setter
var sitterAge by vetoable(0, fun(_, _, n): Boolean {
    val ageRange = 20..60
    if (n !in ageRange) {
        throw Exception("sitter age should be in $ageRange")
    }
    return true
})
*/

var sitterAge by vetoable(0, { _, _, n -> n in 20..60 })

fun main() {
    myVariable = 30
    myVariable = 50

    println(sitterAge)
    sitterAge = 30
    println(sitterAge)
    sitterAge = 70
    println(sitterAge)  // sitter is still 30
}