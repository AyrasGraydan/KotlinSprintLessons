package Lesson_1_10.Lesson_9

fun main() {
    val setIngredients = mutableSetOf<String>()
    val numberOfIngredients = 5

    println("Введите $numberOfIngredients ингридиентов: ")
    for (i in 1..numberOfIngredients) {
        print("#$i ")
        setIngredients.add(readln())
    }

    val printString = setIngredients.sorted().joinToString(", ").replaceFirstChar { it.uppercase() }
    println(printString)
}