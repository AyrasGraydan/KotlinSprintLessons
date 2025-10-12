package Lesson_1_10.Lesson_8

fun main() {
    val arrayOfDishes = arrayOf("листья", "гренки", "пармезан", "соус", "мясо", "томаты")

    println(arrayOfDishes.joinToString())

    print("Заменить ингридиент? true/false ")
    val isReplaceIngredient = readln().toBoolean()

    if (isReplaceIngredient) {
        print("Какой ингридиент заменить? ")
        val oldIngredient = readln().lowercase()

        val index = arrayOfDishes.indexOf(oldIngredient)

        if (oldIngredient in arrayOfDishes) {
            print("На какой ингридиент заменить? ")
            val newIngredient = readln()

            arrayOfDishes[index] = newIngredient

            println()
            println("Готово! Вы сохранили следующий список:")

            println(arrayOfDishes.joinToString())
        } else println("Такого ингридиента нет")
    }
}