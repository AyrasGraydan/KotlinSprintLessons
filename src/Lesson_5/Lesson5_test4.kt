package Lesson_5

fun main() {

    val name = "Zaphod"
    val password = "PanGalactic"

    print("Марвин печально запрашивает ваше имя: ")
    val yourName = readln()

    print("Марвин не менее печально запрашивает ваш пароль: ")
    val yourPassword = readln()

    if (name == yourName) {
        passwordCheck(password, yourPassword)
    } else {
        println("[глубоко вздыхает...] Вашего имени и пароля нет в базе данных...")
        println()

        print("[вздыхает...] Хотите ли вы зарегистрироваться? да/нет ")
        val registerUser =
            if (readln() == "да") true; else false

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
        print("[вздыхает...] Пароль неверный, поробуйте еще раз: ")
        val yourPasswordNew = readln()

        passwordCheck(password, yourPasswordNew, newAttempts)
    } else {
        println()
        println("[глубоко вздыхает...] Ваши попытки, к сожалению, не бескончены, как и мое время")
    }
}