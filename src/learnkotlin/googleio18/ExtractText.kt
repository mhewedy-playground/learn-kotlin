package learnkotlin.googleio18

import kotlin.test.assertTrue

sealed class Element
class Container(vararg val elements: Element) : Element()
class Text(val text: String) : Element()

fun Element.extractText(): String {
    val sb = StringBuilder()
    fun extractText(element: Element) {
        when (element) {
            is Text -> sb.append(element.text)
            is Container -> {
                for (sub in element.elements) {
                    extractText(sub)
                }
            }
        }
    }
    extractText(this)
    return sb.toString()
}

fun main() {
    val root = Container(
        Container(
            Container(Text("A"), Text("B")),
            Container(Text("C"), Text("D"))
        ),
        Text("E")
    )

    assertTrue { root.extractText() == "ABCDE" }
}