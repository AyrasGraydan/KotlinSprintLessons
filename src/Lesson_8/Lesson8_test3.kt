package Lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("листья", "гренки", "пармезан", "соус", "мясо", "томаты")

    print("Введите названия блюда: ")
    val userDish = readln().lowercase()

    if (arrayOfIngredients.indexOf(userDish) != -1)
        println("Ингредиент \"$userDish\" в рецепте есть")
    else println("Такого ингридиента нет")
}
