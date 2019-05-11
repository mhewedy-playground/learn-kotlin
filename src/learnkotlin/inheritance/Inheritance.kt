package learnkotlin.inheritance

open class Person(var firstName: String, var lastName: String) { // extendable classes should be declared `open`


    open fun validate(): Boolean {       // overridable function should be declared  `open`
        return firstName.isNotBlank() && lastName.isNotBlank()
    }
}

enum class App {
    ERP, CRM
}

open class Customer(firstName: String, lastName: String, var clientApp: App = App.CRM) :
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

fun main(args: Array<String>) {
    val c1 = Customer("abdullah", "hewedy")
    println(c1.validate())

    val c2 = Customer("abdullah", "hewedy", App.ERP)
    println(c2.validate())
}
