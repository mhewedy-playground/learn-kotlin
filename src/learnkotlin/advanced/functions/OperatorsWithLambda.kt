package learnkotlin.advanced.functions

import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

operator fun String.invoke(f: String.() -> Unit) {
    f(this)
}

fun main() {

    "test add 10 and 30 should equal 40"() {
        println("Executing: \"$this\"")
        assertEquals(40, 10 + 30)
    }

    "test add 10 and 30 should not equal 50"() {
        println("Executing: \"$this\"")
        assertNotEquals(50, 10 + 30)
    }
}