package Lesson_20

fun main() {
    val isHaveKey = {user: User1 ->
        if (user.isHaveKey)
            "Игрок открыл дверь"
        else "Дверь заперта"
    }

    val user = User1("", 320, 214)
    println(isHaveKey(user))
    user.isHaveKey = true
    println(isHaveKey(user))
}

class User1(
    val name: String,
    val maxHp: Int,
    var currentHp: Int,
    var isHaveKey: Boolean = false
)