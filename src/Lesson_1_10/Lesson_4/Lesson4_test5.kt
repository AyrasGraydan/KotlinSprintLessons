
const val IS_DAMAGED = true
const val FAVORABLE_MIN_NUMBER_OF_CREW = 55
const val FAVORABLE_MAX_NUMBER_OF_CREW = 70
const val FAVORABLE_AMOUNT_OF_BOXES = 50
const val IS_WEATHER_CLEAR = true

fun main() {

    print("Есть ли у корабля повреждения? true/false ")
    val isDamaged: Boolean = readln().toBoolean()

    print("Kоличество экипажа на корабле: ")
    val numberOfCrew: Int = readln().toInt()

    print("Kоличество ящиков провизи на корабле: ")
    val amountOfBoxes: Int = readln().toInt()

    print("Благоприятная ли погода? true/false ")
    val isWeatherClear: Boolean = readln().toBoolean()

    println()

    if ((isDamaged != IS_DAMAGED
                && numberOfCrew in FAVORABLE_MIN_NUMBER_OF_CREW..FAVORABLE_MAX_NUMBER_OF_CREW &&
                amountOfBoxes > FAVORABLE_AMOUNT_OF_BOXES) ||
        (numberOfCrew == FAVORABLE_MAX_NUMBER_OF_CREW && amountOfBoxes >= FAVORABLE_AMOUNT_OF_BOXES && isWeatherClear == IS_WEATHER_CLEAR)
    )
        println("Корабль может отправится в плавание")
    else println("Корабль вероятно утонет")

}
