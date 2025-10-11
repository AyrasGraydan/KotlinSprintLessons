package Lesson_1_10.Lesson_7

fun main() {

    val minLength = 6
    var password = ""

    val lowercaseDiapason = 'a'..'z'
    val uppercaseDiapason = 'A'..'Z'
    val numberDiapason = 0..9

    val randomDiapason = 0..2

    val fullCharacterSet = setOf(lowercaseDiapason, uppercaseDiapason, numberDiapason)
    val characterTypeSet = mutableSetOf<Any>()

    var setDifference = emptySet<Any>()

    print("Введите длинну пароля: ")
    val passwordLength = readln().toInt().coerceAtLeast(minLength)

    for (i in 1..passwordLength) {

        if (password.length >= passwordLength - 2) {
            setDifference = fullCharacterSet - characterTypeSet

            if (setDifference.isNotEmpty()) {
                when (setDifference.random()) {
                    lowercaseDiapason -> {
                        password += lowercaseDiapason.random()
                        characterTypeSet.add(lowercaseDiapason)
                    }

                    uppercaseDiapason -> {
                        password += uppercaseDiapason.random()
                        characterTypeSet.add(uppercaseDiapason)
                    }

                    numberDiapason -> {
                        password += numberDiapason.random()
                        characterTypeSet.add(numberDiapason)
                    }
                }
                continue
            }
        }

        when (randomDiapason.random()) {
            0 -> {
                password += lowercaseDiapason.random()
                characterTypeSet.add(lowercaseDiapason)
            }

            1 -> {
                password += uppercaseDiapason.random()
                characterTypeSet.add(uppercaseDiapason)
            }

            2 -> {
                password += numberDiapason.random()
                characterTypeSet.add(numberDiapason)
            }
        }
    }
    println(password)
}