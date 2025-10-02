package Lesson_9

fun main() {
    val ingredients = listOf("листья", "гренки", "пармезан", "соус", "мясо", "томаты")

    println("В рецепте есть следующие ингредиенты:")
    ingredients.forEachIndexed { index, ingredient ->
        println("#${index + 1} $ingredient")
    }
}