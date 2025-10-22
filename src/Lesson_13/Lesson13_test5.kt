package Lesson_13

fun main() {

    print("Введите номер: ")
    val telephone = readln().toLongOrNull()
    val user: User5

    try {
        user = User5("GGhuman", telephone!!)
        user.printInfo()
    } catch (e: NullPointerException) {
        println("Вы обложались и получили NullPointerException")
    }
}

class User5(
    val name: String,
    val telephone: Long,
    val company: String? = null
) {
    fun printInfo() {
        println("Имя: $name \nТел: $telephone \nКомпания: ${company ?: "<не указано>"}")
    }
}