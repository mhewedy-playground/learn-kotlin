package learnkotlin.classes

//1, first define a constructor and properties that initialized from the constructor
class ACustomer(idParam: Int, nameParam: String) {
    val id: Int = idParam
    var name: String = nameParam
}

// 2, then better use val/var with constructor param to define a property as well
class Customer(val id: Int, var name: String)

fun main(args: Array<String>) {

    val customer = Customer(1, "mhewedy")

    println(customer.id)
    println(customer.name)

    // cannot change val property
//    customer.id = 30

    customer.name = "Mohammad"

    println(customer.name)
}

