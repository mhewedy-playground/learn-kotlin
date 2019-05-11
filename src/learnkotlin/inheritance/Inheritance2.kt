package learnkotlin.inheritance


// secondary constructor need to call primary constructor:
//
// constructor( <parameters list> ) : this(<pass primary constructor args>)
//
// if there's no primary constructor, then secondary constructor will call super class primary constructor:
//
// constructor( <parameters list> ) : super(<pass super class primary constructor args>)
//

open class Device(val serialNumber: String)

class TVSet : Device {

    constructor(serialNumber: String, manufacturer: String) : super(serialNumber)
}

class GameConsole(serialNumber: String) : Device(serialNumber) {

    var is3D: Boolean = false

    constructor(serialNumber: String, is3D: Boolean) : this(serialNumber) {
        this.is3D = is3D
    }
}