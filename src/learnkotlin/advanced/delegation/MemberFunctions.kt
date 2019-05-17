package learnkotlin.advanced.delegation

import learnkotlin.intro.classes.Customer

interface Repository {
    fun findAll(): List<Customer>
}

interface Logger {
    fun log(message: String): Unit
}

class Controller(repository: Repository, logger: Logger) :
    Repository by repository, Logger by logger {

    fun index(): List<Customer> {
        val list = findAll()
        log("find $list of customers")
        return list
    }
}
