package learnkotlin.advanced.delegation

import kotlin.reflect.KProperty

var myProperty: String by PropertyDelegator

object PropertyDelegator {

    var value = "<empty>"

    operator fun getValue(source: Nothing?, property: KProperty<*>): String {
        log(source, property)
        return value
    }

    operator fun setValue(source: Nothing?, property: KProperty<*>, s: String) {
        log(source, property)
        value = s
    }
}

// we can use the anonymous object syntax as well
var myProperty2: String by object {
    operator fun getValue(source: Nothing?, property: KProperty<*>): String {
        log(source, property)
        return PropertyDelegator.value
    }

    operator fun setValue(source: Nothing?, property: KProperty<*>, s: String) {
        log(source, property)
        PropertyDelegator.value = s
    }
}

private fun log(source: Nothing?, property: KProperty<*>) {
    println("source: \"$source\", property: \"$property\"")
}

fun main() {
    println("value is $myProperty")
    myProperty = "10"
    println("value is $myProperty")
}
