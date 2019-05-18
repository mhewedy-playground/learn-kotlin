package learnkotlin.advanced.generics

// use-site variance used for type projection
fun readFromList(list: MutableList<out String>) {

    // list.add("")    // we cannot do this
}

// start projection

fun main() {
    val list = listOf<String>()
    if (list is List<*>){       // star projection

    }
}