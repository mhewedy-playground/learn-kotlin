@file:JvmName("KotlinPersonExtensions")

package learnkotlin.intro.interop

data class KotlinPerson(val id: Long, var name: String) {

    @JvmField
    var email: String? = null

    @JvmName("someFunc")
    fun xyz(): String? = null

    @JvmOverloads
    fun changeStatus(str: String = "alive") {

    }

    companion object {
        const val PI = 3.14
    }
}

fun KotlinPerson.hello() {
    println("hello ${this}")
}