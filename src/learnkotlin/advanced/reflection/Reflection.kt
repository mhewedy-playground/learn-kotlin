package learnkotlin.advanced.reflection

import java.lang.reflect.Type
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlin.reflect.full.memberProperties

class Test(val name: String, val age: Int)

fun main() {

    val kProperty12: KProperty1<Test, String> = Test::name

    val kClass: KClass<Test> = Test::class


    class Abc

    val javaClass: Class<Abc> = Abc().javaClass

    val java: Type = Abc::class.java

    println(Abc().javaClass)
    println(Abc::class.java)

    val kProperty1: KProperty1<Abc, Class<Abc>> = Abc::javaClass
    val kProperty11 = kProperty1(Abc())


    //
    getKotlinType(Test::class)

    // create object by reference to constructor function
    val constructor = ::Test
    val args = constructor.parameters.zip(arrayListOf("ali", 30)).toMap()
    val testObject = constructor.callBy(args)

    println(testObject::name.get())
    println(testObject.name)
    println(testObject::name.call())

    Test::class.memberProperties
        .map { it.get(testObject) }
        .forEach { println("value: $it") }
}

// use Type projection on the KClass
fun getKotlinType(type: KClass<*>) = println(type)