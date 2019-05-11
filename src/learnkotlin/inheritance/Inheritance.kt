package learnkotlin.inheritance

open class Person(var firstName: String, var lastName: String) { // extendable classes should be declared `open`


    open fun validate(): Boolean {       // overridable function should be declared  `open`
        return firstName.isNotBlank() && lastName.isNotBlank()
    }
}

enum class App {
    ERP, CRM
}

open class CrmCustomer : Person {

    var clientApp: App = App.CRM

    constructor(firstName: String, lastName: String, clientApp: App = App.CRM)
            : super(firstName, lastName) {
        this.clientApp = clientApp
    }


    final override fun validate() = super.validate() && clientApp == App.CRM
}

class SpecialCrmCustomer(firstName: String, lastName: String) :
    CrmCustomer(firstName, lastName) {

    /*
    // not allowed, as the super class validate function is final
    override fun validate(): Boolean {
        return super.validate()
    }*/

}

fun main(args: Array<String>) {
    val c1 = CrmCustomer("abdullah", "hewedy")
    println(c1.validate())

    val c2 = CrmCustomer("abdullah", "hewedy", App.ERP)
    println(c2.validate())
}
