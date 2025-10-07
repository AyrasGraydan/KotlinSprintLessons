package Lesson_10

const val login = "mark"
const val password = "0000"

fun main() {
    print("Введите логин: ")
    val userLogin = readln()
    print("Введите пароль: ")
    val userPassword = readln()

    val cartContents = listOf("Клавиатура", "Атомный реактор", "Bugatti")

    val accessTokens =
        if (userLogin == login && userPassword == password) generateToken() else null

    if (accessTokens != null) {
        println("Ваш токен: $accessTokens")
        println()
        println("Содержимое корзины:")
        cartContents.forEach { println(it) }
    } else println("Неверный логин или пароль")
}

fun generateToken(): String {
    var token = ""
    val numbers = 0..9
    val chars = 'a'..'z'
    val charsUppercase = 'A'..'Z'

    for (i in 1..32) {
        token += (numbers + chars + charsUppercase).random()
    }
    return token
}