package Lesson_12

fun main() {
    val month = mutableListOf<DayWeather5>()
    val dayTemperature = -10..23
    val nightTemperature = -20..10

    for (i in 1..30) {
        month.add(
            DayWeather5(
                i.toString().padStart(2, '0') + ".11.2042",
                dayTemperature.random(),
                nightTemperature.random(),
                (0..1).random() == 0
            )
        )
    }

    val temperatureOfDays = month.map { it.dayTemperature }
    val temperatureOfNights = month.map { it.nightTemperature }
    val daysWithPrecipitation = month.count { it.isHavePrecipitation }

    val averageTemperature = (temperatureOfDays + temperatureOfNights).average().toInt()

    println(
        """
        Средняя температура за месяц: $averageTemperature
        Дней с осадками: $daysWithPrecipitation
    """.trimIndent()
    )
}

class DayWeather5(
    val day: String,
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isHavePrecipitation: Boolean
)