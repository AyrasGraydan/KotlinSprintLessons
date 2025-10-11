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

    if (accessToken != null) {
        println("Содержимое корзины: ")
        getCartContents().forEachIndexed {
            index, string -> println("${index + 1}. $string") }
    } else println("неверный логин или пароль:(")
}

fun generateToken(): String {
    val numbers = 0..9
    val chars = 'a'..'z'
    val charsUppercase = 'A'..'Z'
    val fullDiapason = numbers + chars + charsUppercase

    val token = (1..32).map { fullDiapason.random() }.joinToString("")
    return token
}

fun authenticateUser(userLogin: String, userPassword: String): String? =
    if (userLogin == LOGIN && userPassword == PASSWORD) generateToken() else null

fun getCartContents(): List<String> {
    val cartContents = listOf("Клавиатура", "Атомный реактор", "Bugatti")
    return cartContents
}