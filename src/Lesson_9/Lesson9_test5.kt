package Lesson_9

fun main() {

    val setIngredients = mutableSetOf<String>()
    val numberOfIngredients = 5

    println("Введите $numberOfIngredients ингридиентов: ")
    for (i in 0 until numberOfIngredients) setIngredients.add(readln())

    val printString = setIngredients.sorted().joinToString(", ").replaceFirstChar { it.uppercase() }
    println(printString)

}