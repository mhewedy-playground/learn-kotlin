package learnkotlin.advanced.generics

open class Child
class Student : Child()

interface Reader<out T> {
    fun read(): T
}

interface Writer<in T> {
    fun write(obj: T): Unit
}

fun read(reader: Reader<Child>) {

}

fun write(writer: Writer<Student>) {

}


class ReaderImpl<out T>() : Reader<T> {
    override fun read(): T = TODO()
}

class WriterImpl<in T> : Writer<T> {
    override fun write(obj: T) {
    }
}


fun main() {

    read(ReaderImpl<Child>())
    read(ReaderImpl<Student>())

    write(WriterImpl<Child>())
    write(WriterImpl<Student>())
}