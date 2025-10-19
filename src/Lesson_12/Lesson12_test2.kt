package Lesson_12

fun main() {
    val day1 = DayWeather2("01.11.2023", 12, -4, true)
    val day2 = DayWeather2("04.12.2042", 53, -27, false)
}

class DayWeather2(
    day: String,
    dayTemperature: Int,
    nightTemperature: Int,
    isHavePrecipitation: Boolean
) {
    init {
        println(
            """
                День: $day
                    Дневная температура: $dayTemperature
                    Ночная температура $nightTemperature
                    Наличие осадков $isHavePrecipitation""".trimIndent()
        )
    }
}