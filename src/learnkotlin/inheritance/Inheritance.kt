package learnkotlin.inheritance

open class Person { // extendable classes should be declared `open`

    open fun validate() {       // overridable function should be declared `open`

    }
}

class Customer : Person() {

    override fun validate() {

    }
}
