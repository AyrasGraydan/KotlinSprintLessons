package Lesson_22

fun main() {
    val regularBook1 = RegularBook1("Хроники Нарнии", "Клайв Стейплз Льюис")
    val dataBook1 = DataBook1("Хроники Нарнии", "Клайв Стейплз Льюис")

    println(regularBook1)
    println(dataBook1)

//    1. в строковом виде (pritn() при выводе класса конвертирует его в строку) класс выглядит
//    примерно следующим видом "Lesson_22.RegularBook1@72ea2f77"
//    2. в data классе функция tostring изменена и приводит класса в строку осмысленного содержания
//    для человека с его полями и значениями
}

class RegularBook1(val bookName: String, val author: String)
data class DataBook1(val bookName: String, val author: String)