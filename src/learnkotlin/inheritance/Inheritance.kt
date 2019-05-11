package learnkotlin.inheritance

open class Person(var firstName: String, var lastName: String) { // extendable classes should be declared `open`


    open fun validate(): Boolean {       // overridable function should be declared  `open`
        return firstName.isNotBlank() && lastName.isNotBlank()
    }
}

enum class App {
    ERP, CRM
}

class CrmCustomer(firstName: String, lastName: String, val clientApp: App = App.CRM) :
    Person(firstName, lastName) {

    override fun validate() = super.validate() && clientApp == App.CRM
}

fun main(args: Array<String>) {
    val c1 = CrmCustomer("abdullah", "hewedy")
    println(c1.validate())

    val c2 = CrmCustomer("abdullah", "hewedy", App.ERP)
    println(c2.validate())
}
