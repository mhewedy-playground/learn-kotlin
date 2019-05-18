package learnkotlin.advanced.generics

open class Person
class Employee : Person()

fun operate(array: Array<Person>) {
    array[0] = Person()
}

fun operate(array: List<Person>) {

}

fun mutableOperate(array: MutableList<Person>) {

}

fun main() {
    operate(arrayOf<Person>(Person(), Person()))
    // operate(arrayOf<Employee>(Employee(), Employee()))      // Not Allowed

    operate(listOf<Person>(Person(), Person()))
    operate(listOf<Employee>(Employee(), Employee()))

    mutableOperate(mutableListOf<Person>(Person(), Person()))
//    mutableOperate(mutableListOf<Employee>(Employee(), Employee())) // Not Allowed too

    // ----------
    val array = arrayOf<Person>(Employee(), Employee())
    println(array.joinToString { it.javaClass.simpleName })  // Employee, Employee
    operate(array)
    println(array.joinToString { it.javaClass.simpleName }) // Person, Employee
}