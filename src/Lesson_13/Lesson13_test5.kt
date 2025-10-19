package Lesson_13

fun main() {

    print("Введите номер: ")
    val telephone = readln().toLongOrNull()
    val user: User5

    if (telephone != null)
        user = User5("GGhuman", telephone)
    else println("Вы обложались и получили NullPointerException")
}

class User5(
    val name: String,
    val telephone: Long,
    val company: String? = null
)