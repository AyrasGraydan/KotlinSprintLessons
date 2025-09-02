package Lesson_8

fun main() {

    val arrayOfDishes = arrayOf("листья", "гренки", "пармезан", "соус", "мясо", "томаты")

    print("Введите названия блюда: ")
    val userDish = readln()
    var availabilityOfDish = false

    for (i in arrayOfDishes) {

        if (userDish == arrayOfDishes[arrayOfDishes.indexOf(i)]) availabilityOfDish = !availabilityOfDish
    }

    if (availabilityOfDish) println("Ингредиент \"$userDish\" в рецепте есть")
    else println("Такого ингредиента в рецепте нет")

}
