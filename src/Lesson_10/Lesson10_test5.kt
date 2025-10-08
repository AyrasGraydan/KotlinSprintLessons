package Lesson_10

const val LOGIN = "mark"
const val PASSWORD = "0000"

fun main() {
    val cartContents = listOf("Клавиатура", "Атомный реактор", "Bugatti")

    print("Введите логин: ")
    val userLogin = readln()
    print("Введите пароль: ")
    val userPassword = readln()

    val accessToken = authenticateUser(userLogin, userPassword)
    println()
    getCartContents(accessToken, cartContents)
}

fun generateToken(): String {
    var token = ""
    val numbers = 0..9
    val chars = 'a'..'z'
    val charsUppercase = 'A'..'Z'
    val fullDiapason = numbers + chars + charsUppercase

    for (i in 1..32) {
        token += fullDiapason.random()
    }
    return token
}

fun authenticateUser(userLogin: String, userPassword: String): String? =
    if (userLogin == LOGIN && userPassword == PASSWORD) generateToken() else null

fun getCartContents(token: String?, cartContents: List<String>) {
    if (token != null) {
        println("Содержимое корзины:")
        cartContents.forEach { println(it) }
    } else println("Неверный логин или пароль")
}