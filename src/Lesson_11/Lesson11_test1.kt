package Lesson_11.test1

fun main() {
    val user1 = User(61321532, "dash331", "161ytf@4", "dash331@gmail.com")
    val user2 = User(11116872, "zero17", "hardPassword", "notZero@proton.me")

    user1.printUserInfo()
    println()
    user2.printUserInfo()
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String
) {
    fun printUserInfo() {
        println(id)
        println(login)
        println(password)
        println(mail)
    }
}