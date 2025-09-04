package Lesson_9

fun main() {

    val mapIngredient = mapOf("яйца" to "2 шт", "молока" to "50 мл", "сливочного масла" to "15 гр")

    print("Введите количество порций: ")
    val numberOfServings = readln().toInt()

    val mapPortionSize =
        mapIngredient.map { (key, value) ->
            val listValue = value.split(" ")
            (listValue[0].toInt() * numberOfServings).toString() + " ${listValue[1]}," to key
        }

    print("На $numberOfServings порций вам понадобится: ")

    var stringIngredient = ""
    mapPortionSize.forEach { (key, value) ->
        stringIngredient += "$value - $key "
    }

    println(stringIngredient.dropLast(2))

}
