package Lesson_13

fun main() {
    val companies = listOf("YouTube", "Tutamail", "null", null, null)
    val names = listOf("avelin", "ayras", "aldor", "graydan", "noname")
    val numberLength = 1..9
    val numbers = 0..9

    val telephoneBook = names.mapIndexed { index, _ ->
        User3(
            names[index],
            ("1" + numberLength.map { numbers.random() }.joinToString("")).toLong(),
            companies[index]
        )
    }

    telephoneBook.mapNotNull { it.company }.forEach { println(it) }
}

class User3(
    val name: String,
    val telephone: Long,
    val company: String? = null
) {
    fun printInfo() {
        println("Имя: $name \nТел: $telephone \nКомпания: ${company ?: "<не указано>"}")
    }
}