package Lesson_10

const val SECOND_TO_MILLISECOND = 1000L
const val TWO_SECONDS_TO_MILLISECOND = 2000L

fun main() {
    val gameResults = mutableListOf<String>()

    do {
        gameResults.add(startGame())
        print("Желаете начать новую партию? да/нет: ")
    } while (readln().equals("да", true))

    println()
    val numberOfWins = gameResults.count{it == "win"}

    println("Ваше число побед: $numberOfWins")
    if (numberOfWins == 0) println("Вам еще повезет, обязательно!")
}

fun throwDice(): Int = (1..6).random()

fun startGame(): String {
    val userRollResult = throwDice()
    val machineRollResult = throwDice()

    Thread.sleep(TWO_SECONDS_TO_MILLISECOND)
    println("Ваш бросок: $userRollResult ")
    Thread.sleep(TWO_SECONDS_TO_MILLISECOND)
    println("Бросок машины: $machineRollResult ")
    Thread.sleep(SECOND_TO_MILLISECOND)

    return when {
        userRollResult > machineRollResult -> "win"
        userRollResult < machineRollResult -> "lose"
        else -> "draw"
    }
}