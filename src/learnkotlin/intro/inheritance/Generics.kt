package learnkotlin.intro.inheritance

interface Repository<T> {

    fun findById(id: Int): T
    fun findAll(): List<T>
}

class RepositoryImpl<T> : Repository<T> {

    override fun findById(id: Int): T {
        TODO("not implemented")
    }

    override fun findAll(): List<T> {
        TODO("not implemented")
    }
}

data class User(val username: String, val email: String)

fun main(args: Array<String>) {

    val userRepository = RepositoryImpl<User>()

    userRepository.findById(10)
}