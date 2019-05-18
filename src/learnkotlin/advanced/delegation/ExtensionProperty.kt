package learnkotlin.advanced.delegation

import kotlin.reflect.KProperty

val String.hasAmpersand: Boolean
    get() = "&" in this

val String.hasDot: Boolean by object {
    operator fun getValue(thisRef: String, property: KProperty<*>) = "." in thisRef
}

/* // This can works to

val String.hasDot: Boolean by HasDotExtensionObject()

class HasDotExtensionObject {
    operator fun getValue(thisRef: String, property: KProperty<*>) = "." in thisRef
}
*/



fun main() {
    println("\"Hello\".hasAmpersand = ${"Hello".hasAmpersand}")
    println("\"Hello & Hi\".hasAmpersand = ${"Hello & Hi".hasAmpersand}")

    println("\"xyz\".hasDot = ${"xyz".hasDot}")
    println("\"abc.xyz\".hasDot = ${"abc.xyz".hasDot}")
}