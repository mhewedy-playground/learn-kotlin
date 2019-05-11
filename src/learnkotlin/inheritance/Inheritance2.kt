package learnkotlin.inheritance


// secondary constructor need to call primary constructor:
//
// constructor( <parameters list> ) : this(<pass primary constructor args>)
//
// if there's no primary constructor, then secondary constructor will call super class primary constructor:
//
// constructor( <parameters list> ) : super(<pass super class primary constructor args>)
//
// eventually, the super class primary constructor should be called

open class Device(val serialNumber: String)

class TVSet : Device {

    // it is better to move to primary constructor, but only for demonstration
    constructor(serialNumber: String, manufacturer: String) : super(serialNumber)
}

class GameConsole(serialNumber: String) : Device(serialNumber) {

    var is3D: Boolean = false

    constructor(serialNumber: String, is3D: Boolean) : this(serialNumber) {
        this.is3D = is3D
    }
}

fun main(args: Array<String>) {

    val samsung = TVSet("123423", "Samsung")
    val playstation = GameConsole("123", true)

    println(samsung)
    println(playstation)
}