package learnkotlin.advanced.classes

class DirectoryExplorer {

    fun listFolder(folder: String, user: String) {

        val permissionChecker = PermissionChecker()
        permissionChecker.validatePermissions(user)

        // to do list folder contents
    }

    class PermissionChecker {
        fun validatePermissions(user: String) {
        }
    }
}