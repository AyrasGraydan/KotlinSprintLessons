package Lesson_7

const val LENGTH_ALPHABET = 26
const val DECIMAL_NUMBER_SYSTEM = 10

fun main() {

    val passwordLength = 6
    var password = ""

    while (password.length != passwordLength){

            if (password.length % 2 == 0) {

                val random = (1..LENGTH_ALPHABET).random()
                var position = 0

                for (i in 'a'..'z') {
                    position++
                    if (position == random) {
                        password += i
                        break
                    }
                }
            } else {
                val random = (1..DECIMAL_NUMBER_SYSTEM).random()
                var position = 0

                for (i in 0..9) {
                    position++
                    if (position == random) {
                        password += i
                        break
                    }
                }
            }
        }
    println(password)
}

