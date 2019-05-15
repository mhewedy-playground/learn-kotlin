package learnkotlin.interop

class KotlinPerson(val id: Long, var name: String) {

    @JvmField
    var email: String? = null

    @JvmOverloads
    fun changeStatus(str: String = "alive") {

    }

    companion object {
        const val PI = 3.14
    }
}