package Lesson_9

fun main() {
    val standardPortion = mapOf("яйца" to "2 шт", "молока" to "50 мл", "сливочного масла" to "15 гр")

    print("Введите количество порций: ")
    val numberOfServings = readln().toIntOrNull() ?: 0

    val userPortion = standardPortion.map { (ingredient, quantity) ->
        val listQuantity = quantity.split(" ")
        ingredient to (listQuantity[0].toInt() * numberOfServings).toString() + " ${listQuantity[1]}"
    }

    println("На $numberOfServings порций вам понадобится: "
                + userPortion.joinToString { (key, value) -> "\"$key\" - $value" })
}
