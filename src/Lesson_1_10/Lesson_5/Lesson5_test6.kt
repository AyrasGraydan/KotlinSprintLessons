package Lesson_1_10.Lesson_5

const val CENTIMETERS_IN_METERS = 100

fun main() {

    print("Введите ваш вес в килограммах: ")
    val weightKg = readln().toFloat()

    print("Введите ваш рост в сантиметрах: ")
    val heightCm = readln().toFloat()

    val heightM = (heightCm / CENTIMETERS_IN_METERS).toDouble()

    val bodyMassIndex = weightKg / Math.pow(heightM, 2.0)
    println("Ваш ИМТ: ${String.format("%.2f", bodyMassIndex)}")

    when {
        bodyMassIndex < 18.5 -> println("Недостаточная масса тела")
        bodyMassIndex < 25 -> println("Нормальная масса тела")
        bodyMassIndex < 30 -> println("Избыточная масса тела")
        bodyMassIndex >= 30.0 -> println("Ожирение")
        else -> println("Некорректное значение ИМТ")
    }

}