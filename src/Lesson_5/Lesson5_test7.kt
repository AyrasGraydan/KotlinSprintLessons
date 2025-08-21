package Lesson_5

import java.io.IO.readln

const val FUEL_COUNTING_DISTANCE = 100

fun main() {

    val distance = readln("Введите расстояние в km: ").toFloat()
    val fuelConsumptionPer100Km = readln("Введите рассход топлива на 100km в l: ").toFloat()
    val fuelPrice = readln("Введите цену за литр топлива: ").toFloat()

    val totalLiters = (distance * fuelConsumptionPer100Km) / FUEL_COUNTING_DISTANCE
    val fuelCost = totalLiters * fuelPrice

    println("Общий объем топлива в l: ${"%.2f".format(totalLiters)}")
    println("Общая стоимость топлива: ${"%.2f".format(fuelCost)}")
}