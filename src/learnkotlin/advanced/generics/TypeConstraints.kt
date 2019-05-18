package learnkotlin.advanced.generics

abstract class Entity(var id: Long?)
interface Savable {
    fun doSave()
}

class Repository<T> where T : Entity, T : Savable { // multi upper bound, only one can be a class

    fun save(entity: T) {
        if (entity.id != null) {
            entity.doSave()
        }
    }
}

fun <T : Entity> save(entity: T) {  // single upper bound only
    if (entity.id != null) {

    }
}