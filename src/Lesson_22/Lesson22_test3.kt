package Lesson_22

fun main() {
    val dataBook1 = DataBook3("Хроники Нарнии", "Клайв Стейплз Льюис", 1950)
    val (bookName, author, year) = dataBook1
    println("$bookName - $author - $year")
}

data class DataBook3(val bookName: String, val author: String, val year: Int)