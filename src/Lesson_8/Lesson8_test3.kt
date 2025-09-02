package Lesson_8

fun main() {

    val arrayOfDishes = arrayOf("листья", "гренки", "пармезан", "соус", "мясо", "томаты")

    print("Введите названия блюда: ")
    val userDish = readln()

    if (arrayOfDishes.indexOf(userDish) != -1)
        println("Ингредиент \"$userDish\" в рецепте есть")
    else println("Такого ингредиента в рецепте нет")

}
