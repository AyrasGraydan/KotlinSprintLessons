package Lesson_11.test2

fun main() {

    val userMe = User2(
        id = 59123590,
        login = "ayras",
        password = "1111",
        mail = "ayras@gmail.com",
    )

    userMe.changeBio()
    println()
    userMe.changePassword()
    println()
    userMe.printUserInfo()
}