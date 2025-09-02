package Lesson_8

fun main() {

    val arrayOfDishes = arrayOf("листья", "гренки", "пармезан", "соус", "мясо", "томаты")

    for (i in arrayOfDishes) {
        println("#${arrayOfDishes.indexOf(i) + 1} $i")
    }

    print("Заменить ингридиент? true/false ")
    val isReplaceIngredient = readln().toBoolean()

    if (isReplaceIngredient) {
        print("Какой ингридиент заменить? ")
        val substituteIngredient = readln()

        val index = arrayOfDishes.indexOf(substituteIngredient)

        if (index != -1) {
            print("На какой ингридиент заменить? ")
            val newIngredient = readln()

            arrayOfDishes.set(index, newIngredient)

            println()
            println("Готово! Вы сохранили следующий список:")

            for (i in arrayOfDishes) {
                println("#${arrayOfDishes.indexOf(i) + 1} $i")
            }

        } else println("Такого ингридиента нет")
    }
}