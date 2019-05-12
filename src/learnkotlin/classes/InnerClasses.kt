package learnkotlin.classes

class Outer {


    // by default, inner classes are static nested classes
    class Nested {

    }

    inner class Inner {

    }
}

fun main(args: Array<String>) {


    val nested = Outer.Nested()

    val inner = Outer().Inner()
}