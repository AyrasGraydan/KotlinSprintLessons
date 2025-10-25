package Lesson_13

fun main() {
    print("Введите номер: ")
    val telephone = readln()
    val user: User5

    try {
        user = User5("GGhuman", telephone.toLong())
        user.printInfo()
    } catch (e: NumberFormatException) {
        println("Вы обложались и получили ${e::class.simpleName}")
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