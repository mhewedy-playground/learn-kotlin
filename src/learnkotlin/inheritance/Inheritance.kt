package learnkotlin.inheritance


// secondary constructor need to call primary constructor:
//
// constructor( <parameters list> ) : this(<pass primary constructor args>)
//
// if there's no primary constructor, then secondary constructor will call super class primary constructor:
//
// constructor( <parameters list> ) : super(<pass super class primary constructor args>)
//


enum class App {
    ERP, CRM
}

open class Person(var firstName: String, var lastName: String) { // extendable classes should be declared `open`

    open fun validate(): Boolean {       // overridable function should be declared  `open`
        return firstName.isNotBlank() && lastName.isNotBlank()
    }
}

open class Customer(firstName: String, lastName: String, val clientApp: App = App.CRM) :
    Person(firstName, lastName) {

    final override fun validate() = super.validate() && clientApp == App.CRM
}

class CrmCustomer(firstName: String, lastName: String) :
    Customer(firstName, lastName) {

    /*
    // not allowed, as the super class validate function is final
    override fun validate(): Boolean {
        return super.validate()
    }*/

}

// data class can extend regular class
data class CustomerEntity(var myFirstName: String, var myLastName: String) :
    Customer(myFirstName, myLastName)

fun main(args: Array<String>) {
    val c1 = CrmCustomer("abdullah", "hewedy")
    println(c1.validate())

    val c2 = Customer("abdullah", "hewedy", App.ERP)
    println(c2.validate())

    val customerEntity = CustomerEntity("Ali", "BaBa")
    println(customerEntity)
    println(customerEntity.clientApp)
}
