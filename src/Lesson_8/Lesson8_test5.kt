package Lesson_8

fun main() {

    print("Ведите количсетво ингридиентов: ")
    val numberOfIngredients = readln().toInt()

    var arrayOfIngredients = Array(numberOfIngredients) { "" }

    for (i in arrayOfIngredients) {
        print("Введите название блюда #${arrayOfIngredients.indexOf(i) + 1}: ")
        arrayOfIngredients.set(arrayOfIngredients.indexOf(i), readln())

    }

    println(arrayOfIngredients.joinToString(", "))

}