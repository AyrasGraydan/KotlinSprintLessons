package Lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("листья", "гренки", "пармезан", "соус", "мясо", "томаты")

    print("Введите названия блюда: ")
    val userIngredient = readln().lowercase()

    if (userIngredient in arrayOfIngredients)
        println("Ингредиент \"$userIngredient\" в рецепте есть")
    else println("Такого ингридиента нет")
}
