package Lesson_5

import java.io.IO.readln
import kotlin.math.pow

const val CENTIMETERS_IN_METERS = 100

fun main() {

    val weightKg = readln("Введите ваш вес в килограммах: ").toFloat()
    val heightCm = readln("Введите ваш рост в сантиметрах: ").toFloat()

    val heightM = (heightCm / CENTIMETERS_IN_METERS).toDouble()

    val bodyMassIndex = weightKg / heightM.pow(2.0).toFloat()

    when {
        bodyMassIndex < 18.5 -> println("Недостаточная масса тела")
        bodyMassIndex < 25 -> println("Нормальная масса тела")
        bodyMassIndex < 30 -> println("Избыточная масса тела")
        bodyMassIndex >= 30.0 -> println("Ожирение")
        else -> println("Некорректное значение ИМТ")
    }

}