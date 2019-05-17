package learnkotlin.advanced.classes

import learnkotlin.intro.classes.Customer

interface CustomerRepository {
    fun findAll(): List<Customer>
}

class CustomerController {

    private lateinit var customerRepository: CustomerRepository

    fun index(): String {
        return customerRepository.findAll().toString()
    }
}

fun main() {

    CustomerController().index()        //UninitializedPropertyAccessException
}