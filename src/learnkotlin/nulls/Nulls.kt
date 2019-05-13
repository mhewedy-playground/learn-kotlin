package learnkotlin.nulls

import learnkotlin.classes.CustomerJava

typealias str = String

fun main(args: Array<String>) {

    var first: str = "first message"
    var second: str? = null

    println(first)
    println(second)


    val customerJava = getCustomerJava()
//    println("length is ${customerJava?.name?.length}")
//
//    println("name is ${customerJava!!.name}")

    val len = customerJava?.name?.length

    val hello: String? = "Hello"
    customerJava?.name = hello


    checkNotNull(hello)

    var nullMessage: String? = null
    nullMessage = ""
    println(nullMessage.length)

}

private fun getCustomerJava(): CustomerJava? = CustomerJava()