package Lesson_4


const val FAVORABLE_WEATHER = "солнечная"
const val FAVORABLE_AWNING = "открыт"
const val FAVORABLE_AIR_HUMIDITY = 20

const val UNFAVORABLE_TIME_OF_YEAR = "зима"


fun main() {

    val weather = "солнечная"
    val awning = "открыт"
    val airHumidity = 20
    val timeOfYear = "зима"


    val favorableConditions =
        weather == FAVORABLE_WEATHER && awning == FAVORABLE_AWNING && airHumidity == FAVORABLE_AIR_HUMIDITY && timeOfYear != UNFAVORABLE_TIME_OF_YEAR

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")

}