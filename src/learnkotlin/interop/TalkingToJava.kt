package learnkotlin.interop

import java.awt.event.MouseEvent
import java.awt.event.MouseListener

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
    println("${person.id} - ${person.name}")
}