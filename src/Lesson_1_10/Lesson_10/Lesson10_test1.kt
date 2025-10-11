package Lesson_1_10.Lesson_10

const val BLUE = "\u001B[34m"
const val RESET_COLOR = "\u001B[0m"
const val GRAY = "\u001B[37m"
const val RED = "\u001B[31m"
const val GREEN = "\u001B[32m"
const val ORANGE = "\u001B[33m"
const val PURPURE = "\u001B[35m"

fun main() {
    val machineName = BLUE + "Бездушная машина:" + RESET_COLOR
    val userName = BLUE + "Игрок:" + RESET_COLOR
    val userThink = GRAY + "Мысли игрока:"

    val userPhrases1 = arrayOf(
        "Если я не сыграю, человечество падет..",
        "От этого зависят жизни свех..",
        "Не выиграю я - не выиграет никто"
    )
    val userPhrases2 = arrayOf(
        "Может не отказываться?: ",
        "Должен ли я сыграть?: ",
        "Может мне не стоит отказываться?: "
    )

    var numberOfThrows: Int
    val maxNumberOfThrows = 5
    val userThrows = mutableListOf<Int>()
    val machineThrows = mutableListOf<Int>()

    print("$machineName Начнем партию, человек? да/нет ")
    while (!readln().equals("да", true)) {
        println("$userThink ${userPhrases1.random()}")
        print("$userThink ${userPhrases2.random()}")
    }

    println()
    numberOfThrows = selectNumberOfThrows(userName, userThink, maxNumberOfThrows)
    println()
    startGame(numberOfThrows, userThrows, machineThrows)

    val userThrowsSum = userThrows.sum()
    val machineThrowsSum = machineThrows.sum()

    Thread.sleep(1000)
    println("$GREEN$userThrows = $userThrowsSum")
    println("$RED$machineThrows = $machineThrowsSum")
    println()

    Thread.sleep(500)
    when {
        userThrowsSum > machineThrowsSum ->
            println("$userName Человечество одержало вверх над нейросетями..")

        userThrowsSum < machineThrowsSum ->
            println("$machineName Нейросети свергли человечество..")

        else ->
            println("${GRAY}Обе стороны пали..")
    }
}

fun selectNumberOfThrows(userName: String, userThink: String, maxNumberOfThrows: Int): Int {
    var numberOfThrows: Int

    val userPhrases1 = arrayOf(
        "Нет, это слишком долго, у меня нет столько времени",
        "Мир столько не будет ждать",
        "Если партия будет столько длится, то человечкство будет уже не спасти"
    )
    val userPhrases2 = arrayOf(
        "Нет, это невозможно",
        "Я не могу кинуть кубик столько раз ",
        "Как я себе это представляю?"
    )
    val userPhrases3 = arrayOf(
        "Здесь решается судьюа человечества, я не могу не играть..",
        "Если я не сыграю, человечество падет.."
    )

    do {
        print("$userThink Сколько раз бросить кубик?: ")
        numberOfThrows = readln().toIntOrNull() ?: -1
        println()

        when {
            numberOfThrows > maxNumberOfThrows ->
                println("$userThink ${userPhrases1.random()}")

            numberOfThrows < 0 ->
                println("$userThink ${userPhrases2.random()}")

            numberOfThrows == 0 ->
                println("$userThink ${userPhrases3.random()}")

            else -> {
                when (numberOfThrows % 10) {
                    2, 3, 4 -> println("$userName Будем бросать $numberOfThrows раза!")
                    else -> println("$userName Будем бросать $numberOfThrows раз!")
                }
            }
        }
    } while (numberOfThrows !in 1..maxNumberOfThrows)
    return numberOfThrows
}

fun rollTheDice(): Int = (1..6).random()

fun startGame(
    numberOfThrows: Int,
    userThrows: MutableList<Int>,
    machineThrows: MutableList<Int>
) {
    val printMachineThrow = RED + "Бросает бездушная машина:" + RESET_COLOR
    val printUserThrow = GREEN + "Бросает небездушный игрок:" + RESET_COLOR
    var rollResult: Int

    Thread.sleep(2500)
    for (i in 1..numberOfThrows * 2) {
        rollResult = rollTheDice()

        if (i % 2 == 0) {
            println(printMachineThrow)
            machineThrows.add(rollResult)
        } else {
            println(printUserThrow)
            userThrows.add(rollResult)
        }

        when (rollResult) {
            6 -> println("${BLUE}Кубик показывает: $PURPURE$rollResult")
            else -> println("${BLUE}Кубик показывает: $ORANGE$rollResult")
        }
        println()

        Thread.sleep(3000)
    }
}