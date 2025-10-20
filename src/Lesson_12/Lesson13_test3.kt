package Lesson_12

fun main() {
    val day1 = DayWeather3("01.11.2023", 412, 300, true)
    val day2 = DayWeather3("04.12.2042", 230, 112, false)

    day1.printDayInfo()
    day2.printDayInfo()
}

class DayWeather3(
    day: String,
    dayTemperatureInKelvins: Int,
    nightTemperatureInKelvins: Int,
    isHavePrecipitation: Boolean
) {
    val difference = 273.15

    val day = day
    val dayTemperature = (dayTemperatureInKelvins - difference).toInt()
    val nightTemperature = (nightTemperatureInKelvins - difference).toInt()
    val isHavePrecipitation = isHavePrecipitation

    fun printDayInfo() {
        println(
            """ 
                День: $day
                    Дневная температура: $dayTemperature
                    Ночная температура $nightTemperature 
                    Наличие осадков $isHavePrecipitation""".trimIndent()
        )
    }
}