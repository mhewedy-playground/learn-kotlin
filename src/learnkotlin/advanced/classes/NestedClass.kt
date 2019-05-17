package learnkotlin.advanced.classes

class DirectoryExplorer {

    fun listFolder(folder: String, user: String) {

        val permissionChecker = PermissionChecker()
        permissionChecker.validatePermissions(user)

        // to do list folder contents
    }

    class PermissionChecker {       // it is a nested (static) class (check the bytecode)
        fun validatePermissions(user: String) {
        }
    }
}