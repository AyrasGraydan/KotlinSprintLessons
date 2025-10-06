package Lesson_10

fun main() {
    var numberOfUserWins = 0

    do {
        numberOfUserWins += startGame()
        print("Желаете начать новую партию? да/нет: ")
    } while (readln().equals("да", true))

    println()
    println("Ваше число побед: $numberOfUserWins")
    if (numberOfUserWins == 0) println("Вам еще повезет, обязательно!")
}

fun rollTheDice(): Int = (1..6).random()

fun startGame(): Int {
    val userRollResult = rollTheDice()
    val machineRollResult = rollTheDice()

    Thread.sleep(2000)
    println("Ваш бросок: $userRollResult ")
    Thread.sleep(1500)
    println("Бросок машины: $machineRollResult ")
    Thread.sleep(1000)

    if (userRollResult > machineRollResult) return 1
    else return 0
}