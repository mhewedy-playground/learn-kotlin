package learnkotlin.intro.tidbits

const val CameraRecordSettingsPixelCount = 30
/*const */val myConst = callSomeFunction()      // cannot define const on non compile-time constant, like function call

fun callSomeFunction() = 10

object CameraRecordSettings {
    const val pixelCount = 30
}

fun main(args: Array<String>) {
    CameraRecordSettings.pixelCount
    CameraRecordSettingsPixelCount
}