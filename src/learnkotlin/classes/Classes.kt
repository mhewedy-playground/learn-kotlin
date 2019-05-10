package learnkotlin.classes

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
}

