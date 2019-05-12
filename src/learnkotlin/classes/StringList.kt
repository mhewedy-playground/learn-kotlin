package learnkotlin.classes

class StringList : ArrayList<String>() {

    override fun add(element: String): Boolean {
        println("adding $element to the list")
        return super.add(element)
    }
}

class NotClearableArrayList<T> : ArrayList<T>() {
    override fun clear() {
    }
}

fun main(args: Array<String>) {
    val myStringList = StringList()

    myStringList.add("Hello")
    myStringList += "World"

    println(myStringList.joinToString(" "))

    val notClearableArrayList = NotClearableArrayList<Int>()
    notClearableArrayList += 1
    println(notClearableArrayList)
    notClearableArrayList.clear()
    println(notClearableArrayList)
}