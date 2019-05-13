package learnkotlin.tidbits

open class Person

class Employee : Person() {
    fun getVacation(): Int {
        return 10
    }
}

class Contractor : Person()

fun getVacation(person: Person): Unit {
    if (person is Employee) {
        println("employee vacation is ${person.getVacation()}")     // smart cast
    } else {
        // person.getVacation() // Compile Error no getVacation() available at compile time
        println("no vacations for contractor")
    }
}


val input: Any = 10

fun main(args: Array<String>) {

    val emp = Employee()
    val cont = Contractor()

    getVacation(emp)
    getVacation(cont)

    // ClassCastException: java.base/java.lang.Integer cannot be cast to java.base/java.lang.String
//    val str = input as String
//    println(str)


    val str = input as? String  // safe cast: do cast if you can or return null
    println(str?.length)
}