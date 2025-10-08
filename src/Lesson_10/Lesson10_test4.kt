package Lesson_10

const val secondToMillisecond = 1000L
const val twoSecondsToMillisecond = 2000L

fun main() {
    val gameResults = mutableListOf<String>()
    var numberOfWins = 0

    do {
        gameResults.add(startGame())
        print("Желаете начать новую партию? да/нет: ")
    } while (readln().equals("да", true))

    println()
    gameResults.forEach {
        if (it == "wins")
            numberOfWins++
    }
    println("Ваше число побед: $numberOfWins")
    if (numberOfWins == 0) println("Вам еще повезет, обязательно!")
}

fun throwDice(): Int = (1..6).random()

fun startGame(): String {
    val userRollResult = throwDice()
    val machineRollResult = throwDice()

    Thread.sleep(twoSecondsToMillisecond)
    println("Ваш бросок: $userRollResult ")
    Thread.sleep(twoSecondsToMillisecond)
    println("Бросок машины: $machineRollResult ")
    Thread.sleep(secondToMillisecond)

    return when {
        userRollResult > machineRollResult -> "win"
        userRollResult < machineRollResult -> "lose"
        else -> "draw"
    }
}