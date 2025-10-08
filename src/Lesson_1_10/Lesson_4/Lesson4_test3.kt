package Lesson_1_10.Lesson_4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true

const val FAVORABLE_AIR_HUMIDITY = 20
const val UNFAVORABLE_TIME_OF_YEAR = "зима"

fun main() {

    val isSunny = true
    val isTentOpen = true
    val airHumidity = 20
    val timeOfYear = "зима"

    val favorableConditions =
        isSunny == IS_SUNNY &&
                isTentOpen == IS_AWNING_OPEN &&
                airHumidity == FAVORABLE_AIR_HUMIDITY &&
                timeOfYear != UNFAVORABLE_TIME_OF_YEAR

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")

}