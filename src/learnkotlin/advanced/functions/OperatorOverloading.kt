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

fun main() {

    assertEquals(
        Time(15, 0),
        Time(10, 30) + Time(4, 30)
    )
    assertEquals(
        Time(8, 1),
        Time(3, 31) + Time(4, 30)
    )
}