package Lesson_13

fun main() {
    val user1 = User2(
        "John", 142141253312L, "YouTube"
    )
    val user2 = User2(
        "Marin", 1L
    )
    user1.printInfo()
    println()
    user2.printInfo()
}

class User2(
    val name: String,
    val telephone: Long,
    val company: String? = null
) {
    fun printInfo(){
        println("Имя: $name \nТел: $telephone \nКомпания: ${company ?: "<не указано>"}")
    }
}