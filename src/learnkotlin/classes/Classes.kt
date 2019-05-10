package learnkotlin.classes

import java.time.LocalDate
import java.time.Period

//1, first define a constructor and properties that initialized from the constructor
class CustomerWithConstructorAndProperties(idParam: Int, nameParam: String) {
    val id: Int = idParam
    var name: String = nameParam
}

// 2, then better use val/var with constructor param to define a property as well
class Customer(val id: Int, var name: String)

// 3
class CustomerWithDefaultParameter(val id: Int, var name: String = "")

// 4
class CustomerWithInitBlock(val id: Int, var name: String = "") {
    init {
        name = name.toUpperCase()
    }
}

// 5
class CustomerWithSecondaryConstructors(val id: Int, var name: String = "") {

    constructor(idAndName: String) :
            this(
                idAndName.split(",")[0].toInt(),
                idAndName.split(",")[1]
            ) {
        // optional block
    }
}

// 6
class CustomerWithCustomGetter(val id: Int, var name: String, private val dateOfBirth: LocalDate) {

    val age: Int
        get() = Period.between(dateOfBirth, LocalDate.now()).years
}

// 7
class CustomerWithCustomSetter() {
    var ssn: String = ""
        set(value) {
            if (!value.toUpperCase().startsWith("SSN")) {
                throw IllegalArgumentException("should start with SSN")
            }
            field = value
        }
}


// main ***********************************************************************
fun main(args: Array<String>) {

    val customer = Customer(1, "mhewedy")

    println(customer.id)
    println(customer.name)

    // cannot change val property
//    customer.id = 30

    customer.name = "Mohammad"

    println(customer.name)


    val c1 = CustomerWithDefaultParameter(10)
    val c2 = CustomerWithDefaultParameter(id = 2)
    val c3 = CustomerWithDefaultParameter(3, name = "Wael")


    println(CustomerWithInitBlock(id = 10, name = "Wael").name)

    val c4 = CustomerWithSecondaryConstructors("10,Samir")
    println("id: ${c4.id}, name: ${c4.name}")

    println(CustomerWithCustomGetter(1, "Mohammad", LocalDate.of(1985, 1, 1)).age)
    println(CustomerWithCustomGetter(1, "Abdullah", LocalDate.of(2013, 11, 7)).age)
    println(CustomerWithCustomGetter(1, "Farida", LocalDate.of(2016, 9, 9)).age)


    val c5 = CustomerWithCustomSetter()
    try {
        c5.ssn = "123"
    } catch (ex: IllegalArgumentException) {
        println(ex)
    }

    c5.ssn = "SSN123"
    println("ssn number is ${c5.ssn}")
}

