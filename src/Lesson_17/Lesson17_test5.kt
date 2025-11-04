package Lesson_17

fun main() {
    val user = User("avelin", "12345")
    user.login = "astrorg"
    user.password = "____"
    println(user.password)
}

class User(login: String, password: String) {

    var login = login
        set(value) {
            field = value
            println("Вы успешно изменили логин")
        }

    var password = password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
}