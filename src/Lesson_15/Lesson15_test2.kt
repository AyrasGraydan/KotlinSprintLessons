package Lesson_15

fun main() {
    val temperature = Temperature(30)
    val precipitationAmount = PrecipitationAmount(20)

    val weatherServer = WeatherServer()
    weatherServer.sendData(temperature)
    weatherServer.sendData(precipitationAmount)
}

abstract class WeatherStationStats(val value: Int)

class Temperature(value: Int) : WeatherStationStats(value)
class PrecipitationAmount(value: Int) : WeatherStationStats(value)

class WeatherServer {

    fun sendData(data: WeatherStationStats) {
        when (data) {
            is Temperature -> println("Температура: ${data.value}")
            is PrecipitationAmount -> println("Количество осадов: ${data.value}")
            else -> println("Неизвестный тип данных")
        }
    }
}