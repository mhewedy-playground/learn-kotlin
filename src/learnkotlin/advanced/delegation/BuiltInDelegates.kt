package learnkotlin.advanced.delegation

import kotlin.properties.Delegates.observable
import kotlin.properties.Delegates.vetoable


var myVariable by observable(10) { p, o, n ->
    println("${p.name} was $o and now become $n")
}

var sitterAge by vetoable(0) { _, _, n -> n in 20..60 }

fun main() {
    myVariable = 30
    myVariable = 50

    println(sitterAge)
    sitterAge = 30
    println(sitterAge)
    sitterAge = 70
    println(sitterAge)  // sitter is still 30
}