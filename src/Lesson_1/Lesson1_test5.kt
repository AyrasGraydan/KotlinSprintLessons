package Lesson_1

fun main() {

    val seconds = 6480

    val ss = seconds%60
    val mm = seconds/60%60
    val hh = seconds/3600

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
