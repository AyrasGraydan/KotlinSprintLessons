package Lesson_20

fun main() {
    var elements = listOf("header", "footer", "body", "header2", "footer2", "body2")

    elements = elements.map { "Нажат элемент $it" }
    elements.forEachIndexed { index, element ->
        if (index % 2 == 1)
            println(element)
    }
}