package learnkotlin.advanced.classes

class DirectoryExplorer(val user: String) {

    fun listFolder(folder: String) {

        val permissionChecker = PermissionChecker()
        permissionChecker.validatePermissions()

        // to do list folder contents
    }

    inner class PermissionChecker {
        fun validatePermissions() {
            if (user != "mhewedy") {
                throw Exception("access not granted")
            }
        }
    }
}

fun main() {
    val directoryExplorer = DirectoryExplorer("mhewedy")
    directoryExplorer.listFolder("")

    // still can access it on an instance of the [DirectoryExplorer] object
    val pc = DirectoryExplorer("xyz").PermissionChecker()
}