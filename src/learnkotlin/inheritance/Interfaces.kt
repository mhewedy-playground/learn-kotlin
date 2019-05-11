package learnkotlin.inheritance

data class Book(
    val id: Long,
    val isbn: String = "",
    val title: String = "",
    val author: String = ""
)

interface BookRepository {

    val generalImpl: Boolean
        get() = true

    fun save(book: Book) {
        println("generic implementation to save $book")
    }

    fun findById(id: Long): Book
}

class SqlBookRepository : BookRepository {

    override val generalImpl: Boolean
        get() = false

    override fun save(book: Book) {
        println("sql-specific implementation to save $book")
    }

    override fun findById(id: Long): Book {
        return Book(id)
    }
}

fun main(args: Array<String>) {

    val bookRepository = SqlBookRepository()
    val book = bookRepository.findById(10)
    println(book)

    bookRepository.save(Book(1, isbn = "10111313"))

    println(bookRepository.generalImpl)
}