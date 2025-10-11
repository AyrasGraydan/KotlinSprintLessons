package Lesson_1_10.Lesson_9

fun main() {
    val ingredients = mutableListOf("помидоры", "огурцы", "сыр фета")

    println("В рецепте есть базовые ингредиенты: ")
    ingredients.forEachIndexed { index, ingredient -> println("#${index + 1} $ingredient") }

    println()
    print("Желаете добавить еще?: да/skip ")
    val isAddIngredient = readln().equals("да", true)

    if (isAddIngredient) {
        print("Какой ингредиент вы хотите добавить? ")
        ingredients.add(readln())

        println("Теперь в рецепте есть следующие ингредиенты:")
        ingredients.forEachIndexed { index, ingredient -> println("#${index + 1} $ingredient") }
    } else println("Список остался неизменен")
}