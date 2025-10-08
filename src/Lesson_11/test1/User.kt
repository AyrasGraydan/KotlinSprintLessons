package Lesson_11.test1

class User(
    val id: Int, val login: String, val password: String, val mail: String
) {
    fun printUserInfo() {
        println(id)
        println(login)
        println(password)
        println(mail)
    }
}