package Lesson_4

const val FAVORABLE_WEATHER = true
const val FAVORABLE_AWNING = true
const val FAVORABLE_AIR_HUMIDITY = 20

const val UNFAVORABLE_TIME_OF_YEAR = "зима"

fun main() {

    val weather = "солнечная"
    val awning = "открыт"
    val airHumidity = 20
    val timeOfYear = "зима"

    val favorableWeather = if (weather == "солнечная") true; else false
    val favorableAwing = if (awning == "открыт") true; else false

    val favorableConditions =
        favorableWeather == FAVORABLE_WEATHER &&
                favorableAwing == FAVORABLE_AWNING &&
                airHumidity == FAVORABLE_AIR_HUMIDITY &&
                timeOfYear != UNFAVORABLE_TIME_OF_YEAR

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")

}