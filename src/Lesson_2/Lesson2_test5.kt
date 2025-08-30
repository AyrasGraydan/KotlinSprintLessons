package Lesson_2

fun main() {

    val deposit = 70000.0
    val years = 20

    val interestRate = 16.7

    val revenue = deposit * Math.pow(1 + interestRate / FULL_PERCENTAGE, years.toDouble())

    println("%.3f".format(revenue))
}