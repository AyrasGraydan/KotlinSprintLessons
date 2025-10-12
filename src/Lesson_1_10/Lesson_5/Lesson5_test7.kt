package Lesson_1_10.Lesson_5

const val FUEL_COUNTING_DISTANCE = 100

fun main() {

    print("Введите расстояние в km: ")
    val distance = readln().toFloat()

    print("Введите рассход топлива на 100km в l: ")
    val fuelConsumptionPer100Km = readln().toFloat()

    print("Введите цену за литр топлива: ")
    val fuelPrice = readln().toFloat()

    val totalLiters = (distance * fuelConsumptionPer100Km) / FUEL_COUNTING_DISTANCE
    val fuelCost = totalLiters * fuelPrice

    println("Общий объем топлива в l: ${"%.2f".format(totalLiters)}")
    println("Общая стоимость топлива: ${"%.2f".format(fuelCost)}")
}