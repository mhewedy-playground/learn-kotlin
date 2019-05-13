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

fun main(args: Array<String>) {

    val emp = Employee()
    val cont = Contractor()

    getVacation(emp)
    getVacation(cont)
}