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

fun throwDice(): Int = (1..6).random()

fun startGame(): Int {
    val userRollResult = throwDice()
    val machineRollResult = throwDice()

    val secondToMillisecond = 1000L
    val twoSecondsToMillisecond = 2000L

    Thread.sleep(twoSecondsToMillisecond)
    println("Ваш бросок: $userRollResult ")
    Thread.sleep(twoSecondsToMillisecond)
    println("Бросок машины: $machineRollResult ")
    Thread.sleep(secondToMillisecond)

    return if (userRollResult > machineRollResult) 1 else 0
}