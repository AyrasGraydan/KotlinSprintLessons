package Lesson_9

fun main() {

    val listOfIngredients = listOf("листья", "гренки", "пармезан", "соус", "мясо", "томаты")

    println("В рецепте есть следующие ингредиенты:")
    listOfIngredients.forEach { println("№${listOfIngredients.indexOf(it) + 1} $it") }

}