package Lesson_7

const val LENGTH_ALPHABET = 26
const val DECIMAL_NUMBER_SYSTEM = 10

fun main() {

    val passwordLength = 6
    var password = ""

    for (i in 1..3) {

        while (password.length != passwordLength) {

            if (password.length % 2 == 0) {
                for (i in 'a'..'z') {
                    val random = (1..LENGTH_ALPHABET).random()

                    if (random == 1) {
                        password += i
                        break
                    }
                }
            } else {
                for (i in 0..9) {
                    val random = (1..DECIMAL_NUMBER_SYSTEM).random()

                    if (random == 1) {
                        password += i
                        break
                    }
                }
            }
        }
    }
    println(password)
}

