package learnkotlin.advanced.reflection

import java.lang.reflect.Type

fun main() {

    class Abc

    val javaClass: Class<Abc> = Abc().javaClass

    val java: Type = Abc()::class.java

    println(Abc().javaClass)
    println(Abc::class.java)
}