package Lesson_1

const val MINUTE_IN_SECONDS = 60

fun main() {

    val seconds = 6480

    val ss = seconds % MINUTE_IN_SECONDS

    val mm = seconds / MINUTE_IN_SECONDS % MINUTE_IN_SECONDS

    val hh = seconds / (MINUTE_IN_SECONDS * MINUTE_IN_SECONDS)

    val timeString = String.format("%02d:%02d:%02d", hh, mm, ss)
    println(timeString)


//    hh.toString().padStart(2, 'X')

//    Общие спецификаторы:
//    %s:  Строка (String)
//    %d: Целое число (Integer)
//    %f: Число с плавающей точкой (Float, Double)
//    %b: Булево значение (Boolean)
//    %c: Символ (Character)
//    %t: Дата и время (Date, Calendar)
}
