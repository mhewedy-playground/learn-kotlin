package learnkotlin.advanced.classes

import learnkotlin.advanced.classes.Position.*

sealed class Tree(val value: Int)
class Leaf(value: Int) : Tree(value)
class Node(value: Int, val left: Tree, val right: Tree) : Tree(value)

enum class Position {
    CENTER, LEFT, RIGHT
}

fun getNode(): Tree {
    // ....
    val someCondition = true

    return if (someCondition) {
        Node(9, Leaf(10), Node(8, Leaf(3), Leaf(7)))
    } else {
        Leaf(17)
    }
}

fun main() {
    print(getNode())
}

fun print(node: Tree, level: Int = 0, pos: Position = CENTER) {
    when (node) {
        is Leaf -> printNode(node, level, pos)
        is Node -> {
            print(node.left, level + 1, LEFT)
            printNode(node, level, pos)
            print(node.right, level + 1, RIGHT)
        }
    }
}

private fun printNode(node: Tree, level: Int, pos: Position) {
    println("leaf= ${node.value}, at level: $level and post: $pos")
}

