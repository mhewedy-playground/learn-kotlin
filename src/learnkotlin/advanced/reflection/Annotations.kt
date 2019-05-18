package learnkotlin.advanced.reflection

import java.time.Instant
import kotlin.reflect.full.memberProperties

@Target(AnnotationTarget.CLASS)
annotation class Table(val name: String)

@Target(AnnotationTarget.PROPERTY)
annotation class Column(val name: String)

@Table(name = "tbl_contract")
data class Contract(@Column(name = "contract_date") val date: Instant)

fun main() {
    val annotation = Contract::class.annotations
        .find { it.annotationClass.simpleName == "Table" }

    println(annotation)

    Contract::class.memberProperties.flatMap { it.annotations }.forEach {
        println(it.annotationClass.simpleName)
    }
}