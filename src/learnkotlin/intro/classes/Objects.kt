package learnkotlin.intro.classes

object Global {
    const val PI = 3.14159
}

class Abc {
    val address: String = ""

    companion object {
        const val PI = 3.14

        fun print(): Unit {
            // cannot access class's member vars
            // println(address)
        }
    }
}

object Graphic : Runnable {
    override fun run() {
        println("running....")
    }
}

fun main(args: Array<String>) {

    val localObject = object {
        /*const << const not allowed here*/  val PI = 3.14
    }

    println("global ${Global.PI}")
    println("local ${localObject.PI}")
    println("Abc ${Abc.PI}")

    // we cannot create object
    // Graphic() // will not run
    Graphic.run()

    ////

    // anonymous inner class
    val iterable = object : Iterable<String> {
        override fun iterator(): Iterator<String> {
            TODO("not implemented")
        }
    }

    // anonymous inner class in different syntax as lambda
    val iterable2 = Iterable<String> {
        TODO("not implemented")
    }
}