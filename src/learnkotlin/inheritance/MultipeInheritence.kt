package learnkotlin.inheritance

open class A {  // by default classes are not open
    open fun foo() {        // by default class methods are not open
        println("A's Foo")
    }
}

interface B {
    fun foo() { // by default interface methods are open
        println("B's Foo")
    }
}

class C : A(), B {
    override fun foo() {
        println("calling super's Foo:")
        super<B>.foo()
    }
}

fun main(args: Array<String>) {
    val c = C()
    c.foo()
}