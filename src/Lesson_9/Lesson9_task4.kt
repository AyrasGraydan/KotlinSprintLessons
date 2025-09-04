package Lesson_9

fun main() {

    print("Введите 5 ингридиентов: ")
    val ingredients = readln()

    val listIngredients = ingredients.split(", ").sorted()
    print(listIngredients)

}