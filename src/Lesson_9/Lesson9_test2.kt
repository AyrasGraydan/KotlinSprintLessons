package Lesson_9

fun main() {
    val listIngredients = mutableListOf("помидоры", "огурцы", "сыр фета")

    println("В рецепте есть базовые ингредиенты: ")
    listIngredients.forEach { println("№${listIngredients.indexOf(it) + 1} $it") }

    println()
    print("Желаете добавить еще?: да/skip ")
    val isAddIngredient = readln().equals("да", true)

    if (isAddIngredient) {
        print("Какой ингредиент вы хотите добавить? ")
        listIngredients.add(readln())

        println("Теперь в рецепте есть следующие ингредиенты:")
        listIngredients.forEach { println("№${listIngredients.indexOf(it) + 1} $it") }
    } else println("Список остался неизменен")
}