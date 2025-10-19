package Lesson_13

fun main() {
    val user1 = User(
        "John", 142141253312L, "YouTube"
    )
    val user2 = User(
        "Marin", 1L, null
    )
}

class User(
    val name: String,
    val telephone: Long,
    val company: String?
)