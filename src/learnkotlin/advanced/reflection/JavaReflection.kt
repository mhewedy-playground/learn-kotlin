package learnkotlin.advanced.reflection

import java.lang.reflect.Type
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1

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


    // create object by reference to constructor function
    val constructor = ::Test
    val args = constructor.parameters.zip(arrayListOf("ali", 30)).toMap()
    val testObject = constructor.callBy(args)
    println(testObject.name)
}


fun getKotlinType(type: KClass<*>) = println(type)