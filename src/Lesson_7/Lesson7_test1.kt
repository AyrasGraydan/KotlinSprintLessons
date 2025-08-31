package Lesson_7

const val LENGTH_ALPHABET = 26
const val DECIMAL_NUMBER_SYSTEM = 10

fun main() {

    var password = ""

    for (i in 1..3) {

        val expectedPasswordLength = password.length + 1

        while (password.length != expectedPasswordLength) {

            for (i in 'a'..'z') {
                val random = (Math.random() * (LENGTH_ALPHABET + 1)).toInt()

                if (random == 1) {
                    password += i
                    break
                }
            }
        }

        while (password.length == expectedPasswordLength) {

            for (i in 0..9) {
                val random = (Math.random() * DECIMAL_NUMBER_SYSTEM + 1).toInt()

                if (random == 1) {
                    password += i
                    break
                }
            }
        }

    }

    println(password)
}