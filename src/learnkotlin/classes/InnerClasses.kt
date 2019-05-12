package learnkotlin.classes

class Outer {


    class Nested {

    }

    inner class Inner {

    }
}

fun main(args: Array<String>) {


    val nested = Outer.Nested()

    val inner = Outer().Inner()
}