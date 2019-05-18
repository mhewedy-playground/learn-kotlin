package learnkotlin.advanced.generics

interface ReadOnlyRepoCovariant<out T> {        // declaration-side variant
    fun findOne(id: Int): T
    fun findAll(): List<T>
}

interface ReadOnlyRepoInVariant<T> {
    fun findOne(id: Int): T
    fun findAll(): List<T>
    fun save(entity: T)
}

fun doWithCovariant(repo: ReadOnlyRepoCovariant<Person>) {

}

fun doWithInvariant(repo: ReadOnlyRepoInVariant<Person>) {

}

fun main() {

    doWithCovariant(object : ReadOnlyRepoCovariant<Person> {
        override fun findOne(id: Int): Person {
            return Person()
        }

        override fun findAll(): List<Person> {
            return emptyList()
        }
    })

    doWithCovariant(object : ReadOnlyRepoCovariant<Employee> {
        override fun findOne(id: Int): Employee {
            return Employee()
        }

        override fun findAll(): List<Employee> {
            return emptyList()
        }
    })


    doWithInvariant(object : ReadOnlyRepoInVariant<Person> {
        override fun save(entity: Person) {

        }

        override fun findOne(id: Int): Person {
            return Person()
        }

        override fun findAll(): List<Person> {
            return emptyList()
        }
    })

    // invalid: ReadOnlyRepoInVariant is an invariant interface that expecting the actual type ,
    // not a subtype of it
    /*doWithInvariant(object : ReadOnlyRepoInVariant<Employee> {
        override fun findOne(id: Int): Employee {
            return Employee()
        }

        override fun findAll(): List<Employee> {
            return emptyList()
        }
    })*/
}