package Lesson_1_10.Lesson_8

fun main() {
    print("Ведите количсетво ингридиентов: ")
    val numberOfIngredients = readln().toIntOrNull() ?: 0

    val arrayOfIngredients = Array(numberOfIngredients) { "" }

    for (i in arrayOfIngredients.indices) {
        print("Введите название ингридиента #${i + 1}: ")
        arrayOfIngredients[i] = readln()
    }
    println(arrayOfIngredients.joinToString())
}