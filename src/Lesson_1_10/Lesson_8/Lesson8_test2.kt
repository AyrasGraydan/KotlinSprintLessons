package Lesson_1_10.Lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("листья", "гренки", "пармезан", "соус", "мясо", "томаты")

    print("Введите названия ингридиента: ")
    val userIngredient = readln().lowercase()

    arrayOfIngredients.forEach { ingredient ->
        if (ingredient == userIngredient) {
            println("Ингредиент \"$userIngredient\" в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}
