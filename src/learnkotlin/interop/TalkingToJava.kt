package learnkotlin.interop

import java.awt.event.MouseEvent
import java.awt.event.MouseListener


class KotlinPersonRepositoryImpl : JavaPersonRepository {

    override fun findById(id: Int?): JavaPerson {
        return JavaPerson.asNull() ?: JavaPerson()
    }

    override fun findAll(): MutableList<JavaPerson> {
        TODO("not implemented")
    }
}

fun main() {

    val runnable = Runnable { println("running ") } // SAM (single abstract method)

    val mouseListener = object : MouseListener {        // anonymous inner class
        override fun mouseReleased(e: MouseEvent?) {
        }

        override fun mouseEntered(e: MouseEvent?) {
        }

        override fun mouseClicked(e: MouseEvent?) {
        }

        override fun mouseExited(e: MouseEvent?) {
        }

        override fun mousePressed(e: MouseEvent?) {
        }
    }

    val person = JavaPerson(10, "Ali")
    person.name = "Wael"
    // person.id = null     // compile error: id of type Int (not Int!)
    person.ssn = null       // ssn is nullable (Long!)
    println("${person.id} - ${person.name} - ${person.ssn}")

    val kr = KotlinPersonRepositoryImpl()
    val nameLength = kr.findById(10).name?.length
    println("nameLength = $nameLength")

    kr.findById(10).neverNull() // Type is String not Platform String (String!)
}