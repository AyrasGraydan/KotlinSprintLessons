package Lesson_22

fun main() {
    val regularBook1 = RegularBook("Хроники Нарнии", "Клайв Стейплз Льюис")
    val regularBook2 = RegularBook("Хроники Нарнии", "Клайв Стейплз Льюис")
    val dataBook1 = DataBook("Хроники Нарнии", "Клайв Стейплз Льюис")
    val dataBook2 = DataBook("Хроники Нарнии", "Клайв Стейплз Льюис")
    println(regularBook1 == regularBook2)
    println("${regularBook1.hashCode()} ${regularBook2.hashCode()}")

    println(dataBook1 == dataBook2)
    println("${dataBook1.hashCode()} ${dataBook2.hashCode()}")
//    "==" вызывает equals()
//    1. у обычных классов equals() сравнивает ссылки памяти объектов
//    2. у data классов equals() изменен и сравнивает по их содержимому
}

class RegularBook(val bookName: String, val author: String)

data class DataBook(val bookName: String, val author: String)