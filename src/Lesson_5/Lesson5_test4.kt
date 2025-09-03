package Lesson_5

import java.io.IO.readln

fun main() {

    val name = "Zaphod"
    val password = "PanGalactic"

    val yourName = readln("Марвин печально запрашивает ваше имя: ")
    val yourPassword = readln("Марвин не менее печально запрашивает ваш пароль: ")

    if (name == yourName) {
        passwordCheck(password, yourPassword)
    } else {
        println("[глубоко вздыхает...] Вашего имени и пароля нет в базе данных...")
        println()

        val registerUser =
            if (readln("[вздыхает...] Хотите ли вы зарегистрироваться? да/нет ") == "да") true; else false

        if (registerUser) {

            val newName = yourName
            val newPassword = yourPassword

            println("[вздыхает...] Ваше Данные зарегестрированны")
            println("Вам разрешено входить на борт корабля \"Heart of Gold\". Хотя мне всё равно...")
        }
    }

}

fun passwordCheck(password: String, yourPassword: String, attempts: Int = 0) {

    if (password == yourPassword) {
        println(
            """
                
                [вздыхает...] Ваши данные проверены, и о, чудо, они верны... 
                Пользователь "Zaphod", вам разрешено входить на борт 
                корабля "Heart of Gold". Хотя мне всё равно... Ну вперед, 
                войдите... Если вам так уж надо, в конце концов... 
                [меланхолический вздох...] Надеюсь, вам понравится 
                пребывание здесь больше, чем мне.
            """.trimIndent()
        )
    } else if (attempts == 0) {

        val newAttempts = attempts + 1
        val yourPasswordNew = readln("[вздыхает...] Пароль неверный, поробуйте еще раз: ")

        passwordCheck(password, yourPasswordNew, newAttempts)
    } else {
        println()
        println("[глубоко вздыхает...] Ваши попытки, к сожалению, не бескончены, как и мое время")
    }
}