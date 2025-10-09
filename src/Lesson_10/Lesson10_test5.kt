package Lesson_10

const val LOGIN = "mark"
const val PASSWORD = "0000"

fun main() {
    print("Введите логин: ")
    val userLogin = readln()
    print("Введите пароль: ")
    val userPassword = readln()

    val accessToken = authenticateUser(userLogin, userPassword)
    println()

    val cartContents = getCartContents(accessToken)
    if (cartContents != null) cartContents.forEach { println(it) }
    else println("неверный логин или пароль")
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

fun getCartContents(token: String?): List<String>? {
    val cartContents = listOf("Клавиатура", "Атомный реактор", "Bugatti")

    if (token != null) {
        return cartContents
    }
    return null
}