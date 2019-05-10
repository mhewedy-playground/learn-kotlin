package learnkotlin.classes

data class Company(val name: String) {
    override fun toString(): String {
        return """{"name": "$name" }"""
    }
}

data class CustomerKotlin(var id: Int, var name: String, var email: String, val company: Company) {
    override fun toString(): String {
        return """{"id": "$id", "name": "$name", "email": "$email", "company": $company}"""
    }
}

fun main(args: Array<String>) {

    val customer1 = CustomerKotlin(1, "mhewedy", "mhewedy@gmail.com", Company("ABC"))
    val customer2 = customer1.copy(id = 2)

    println(customer1)
    println(customer2)
}