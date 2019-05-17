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

class MyInvokable {
    operator fun invoke() = "result of MyInvokable"
}

object ObjectInvokable {
    operator fun invoke() = "result of ObjectInvokable"
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

    // ---------
    val myInvokable = MyInvokable()
    println(myInvokable())

    val string = ObjectInvokable()  // the braces for the invoke, not for the constructor,
    // as this is an object and doesn't use constructor braces when invoked
    println(string)

    // ----

    class Messenger {
        infix fun send(message: String) {       // send cannot be operator (unlike scala akka)
            println("sending $message")
        }
    }

    val messenger = Messenger()
    messenger send "Hello"  //infix but with no operator overloading
}