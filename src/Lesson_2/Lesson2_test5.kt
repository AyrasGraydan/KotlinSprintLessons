package Lesson_2

fun main() {

//    – Процентная ставка 16,7%
//    – Ответ должен получиться таким 1536438.428

    val deposit = 70000
    var years = 20

    val interestRate = 16.7
    var revenue = deposit.toDouble()

    for (i in 0 until years){
        revenue += (revenue * 0.167).toDouble()
    }

    println("%.3f".format(revenue))
}