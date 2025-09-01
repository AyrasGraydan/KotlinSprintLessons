package Lesson_7

const val LENGTH_ALPHABET = 26
const val DECIMAL_NUMBER_SYSTEM = 10

fun main() {

    val minLength = 6
    var password = ""

    print("Введите длинну пароля: ")
    val passwordLength = readln().toInt().coerceAtLeast(minLength)

    while (password.length != passwordLength) {

        val numberOfCharacterTypes = 3
        val probability = (Math.random() * numberOfCharacterTypes).toInt()

        if (probability != 0) {

            for (i in 'a'..'z') {
                val randomNumber = (Math.random() * LENGTH_ALPHABET).toInt()

                if (randomNumber == 0) {
                    val randomNumber = (Math.random() * 2).toInt()

                    when (randomNumber) {
                        0 -> password += i.uppercase()
                        1 -> password += i
                    }
                }
            }

        } else {
            for (i in 0..9) {
                val randomNumber = (Math.random() * DECIMAL_NUMBER_SYSTEM).toInt()

                if (randomNumber == 0) password += i
            }
        }
    }

    println(password)

}