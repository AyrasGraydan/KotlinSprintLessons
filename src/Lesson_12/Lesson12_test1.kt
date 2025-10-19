package Lesson_12

fun main() {
    val day1 = DayWeather("01.11.2023", 12, -4, true)
    val day2 = DayWeather("04.12.2042", 53, -27)
}

class DayWeather() {
    var day = "00.00.00"
    var dayTemperature = 0
    var nightTemperature = 0
    var isHavePrecipitation = false

    constructor(
        day: String,
        dayTemperature: Int,
        nightTemperature: Int,
        isHavePrecipitation: Boolean = false
    ) : this() {
        this.day = day
        this.dayTemperature = dayTemperature
        this.nightTemperature = nightTemperature
        this.isHavePrecipitation = isHavePrecipitation

        println(
            """ 
                День: $day
                    Дневная температура: $dayTemperature
                    Ночная температура $nightTemperature 
                    Наличие осадков $isHavePrecipitation""".trimIndent()
        )
    }
}