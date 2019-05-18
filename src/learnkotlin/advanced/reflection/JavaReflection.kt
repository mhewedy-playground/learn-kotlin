package learnkotlin.advanced.reflection

import java.lang.reflect.Type
import kotlin.reflect.KProperty1

fun main() {

    class Abc

    val javaClass: Class<Abc> = Abc().javaClass

    val java: Type = Abc::class.java

    println(Abc().javaClass)
    println(Abc::class.java)

    val kProperty1: KProperty1<Abc, Class<Abc>> = Abc::javaClass
    val kProperty11 = kProperty1(Abc())
}