package Lesson_7

const val LENGTH_ALPHABET = 26
const val DECIMAL_NUMBER_SYSTEM = 10

fun main() {

    val minLength = 6
    var password = ""

    print("Введите длинну пароля: ")
    val passwordLength = readln().toInt().coerceAtLeast(minLength)

    while (password.length != passwordLength) {

        val probability = (1..3).random()

        if (probability != 1) {

            for (i in 'a'..'z') {
                val randomNumber = (1..LENGTH_ALPHABET).random()

                if (randomNumber == 1) {
                    val randomNumber = (1..2).random()

                    when (randomNumber) {
                        1 -> {
                            password += i.uppercase()
                            break
                        }

                        2 -> {
                            password += i
                            break
                        }
                    }
                }
            }
        } else {
            for (i in 0..9) {
                val randomNumber = (1..DECIMAL_NUMBER_SYSTEM).random()

                if (randomNumber == 1) {
                    password += i
                    break
                }
            }
        }
    }

    println(password)
}