package Lesson_21

fun main() {
    val user = User("Astrorg", 740, 1)
    println("${user.isHealthy()} ${user.currentHp}")
    user.currentHp = user.maxHp + 1
    println("${user.isHealthy()} ${user.currentHp}")
}

class User(val name: String, val maxHp: Int, var currentHp: Int)

fun User.isHealthy() = this.maxHp <= this.currentHp