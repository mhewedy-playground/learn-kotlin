package learnkotlin.functional

fun String.hello() {
    println("its me")
}

fun String.toTitleCase(): String {
    return this.split(" ").joinToString(" ") { it.capitalize() }
}

// precedence to the class internal method
object Customer {
    fun myFunction() {
        println("Customer Version")
    }
}

fun Customer.myFunction() {
    println("Extension Version")
}

// statically resolved

open class BaseClass
class SubClass : BaseClass()

fun BaseClass.doIt() {
    println("base")
}

fun SubClass.doIt() {
    println("sub")
}

fun main() {
    "Hello".hello()
    println("hello this is me".toTitleCase())

    Customer.myFunction()

    val subClassAsBaseClass: BaseClass = SubClass()
    subClassAsBaseClass.doIt()  // prints base

    val subClass/*: SubClass */ = SubClass()
    subClass.doIt()  // prints sub
}