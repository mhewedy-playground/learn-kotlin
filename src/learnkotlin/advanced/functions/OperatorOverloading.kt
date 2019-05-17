package learnkotlin.advanced.functions

import kotlin.test.assertEquals

data class Time(val hours: Int, val minutes: Int)

operator fun Time.plus(other: Time): Time {
    val minutes = this.minutes + other.minutes
    val hoursInMinutes = minutes / 60
    val minutesInMinutes = minutes % 60
    return Time(
        this.hours + other.hours + hoursInMinutes,
        minutesInMinutes
    )
}

operator fun StringBuilder.plus(other: StringBuilder) {
    other.forEach { this.append(it) }
}

fun main() {

    assertEquals(
        Time(15, 0),
        Time(10, 30) + Time(4, 30)
    )
    assertEquals(
        Time(8, 1),
        Time(3, 31) + Time(4, 30)
    )

    val sb = StringBuilder("hello yes")
    val sb2 = StringBuilder("hello no")
    sb + sb2
    println(sb)
}