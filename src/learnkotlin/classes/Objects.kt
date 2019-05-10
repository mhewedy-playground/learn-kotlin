package learnkotlin.classes

object Global {
    const val PI = 3.14159
}

class Abc {
    companion object {
        const val PI = 3.14
    }
}

fun main(args: Array<String>) {

    val localObject = object {
        /*const << const not allowed here*/  val PI = 3.14
    }

    println("global ${Global.PI}")
    println("local ${localObject.PI}")
    println("Abc ${Abc.PI}")
}