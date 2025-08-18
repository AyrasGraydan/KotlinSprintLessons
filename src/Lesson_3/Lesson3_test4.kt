package Lesson_3

import java.awt.Stroke

const val MAGIC_NUMBER = 48

//    val whereFrom = "C4"
//    var whereFromY = whereFrom[1].code - MAGIC_NUMBER
// в этом моменте число whereFromY всегда получается на 48 больше, чем whereFrom[1].code, почему, я не знаю, но это не помешало мне ввести эту контстанту

fun main() {

    //variant 1

    var whereFrom = "E2"
    var whereTo = "E4"
    var strokeNumber = 3

    var strokeString = "$whereFrom$whereTo$strokeNumber"
    println(strokeString)

    whereFrom = "D2"
    whereTo = "D3"
    strokeNumber = 5

    strokeString = "$whereFrom$whereTo$strokeNumber"
    println(strokeString)


    //variant 2
    //функция в этом варианте определяет тип хода, а так же определяет невозможные ходы и бесмысленные ходы(E2E21 - ход на месте)
    //но она не учитывает номер хода, то есть первым ходом ты можешь от одного угла дойти до другого, хотя это технически невозможно в начале раунда

    println()

    whereFrom = "D2"
    whereTo = "С4"
    strokeNumber = 3

    println(PossibilityOfMovement(whereFrom, whereTo, strokeNumber))

    println()

    whereFrom = "D2"
    whereTo = "M2" // координаты M2 нет на доске
    strokeNumber = 5

    println(PossibilityOfMovement(whereFrom, whereTo, strokeNumber))

}


fun PossibilityOfMovement(whereFrom: String, whereTo: String, strokeNumber: Int): String {

    var whereFromX = -1
    val whereFromY = whereFrom[1].code - MAGIC_NUMBER

    var whereToX = -1
    val whereToY = whereTo[1].code - MAGIC_NUMBER

    when (whereFrom[0]) {
        'A' -> whereFromX = 1
        'B' -> whereFromX = 2
        'C' -> whereFromX = 3
        'D' -> whereFromX = 4
        'E' -> whereFromX = 5
        'F' -> whereFromX = 6
        'G' -> whereFromX = 7
        'H' -> whereFromX = 8
        else -> whereFromX = 0
    }

    when (whereTo[0]) {
        'A' -> whereToX = 1
        'B' -> whereToX = 2
        'C' -> whereToX = 3
        'D' -> whereToX = 4
        'E' -> whereToX = 5
        'F' -> whereToX = 6
        'G' -> whereToX = 7
        'H' -> whereToX = 8
        else -> whereToX = 0
    }

    if (whereFromX == whereToX && whereFromY == whereToY) {
        return """
            Ход бессмыслен
            $whereFrom$whereTo$strokeNumber
        """.trimIndent()
    } else if (whereFromX - whereToX == whereFromY - whereToY && whereFromX in 1..8 && whereToX in 1..8 && whereFromY in 1..8 && whereToY in 1..8) {
        return """
            Диагональный ход
            $whereFrom$whereTo$strokeNumber
        """.trimIndent()
    } else if (whereFromX == whereToX || whereFromY == whereToY && whereFromX in 1..8 && whereToX in 1..8 && whereFromY in 1..8 && whereToY in 1..8) {
        return """
            Прямолинейный ход
            $whereFrom$whereTo$strokeNumber
        """.trimIndent()
    } else if (whereFromX + 2 == whereToX || whereFromX - 2 == whereToX && whereFromY + 1 == whereToY || whereFromY - 1 == whereToY && whereFromX in 1..8 && whereToX in 1..8 && whereFromY in 1..8 && whereToY in 1..8) {
        return """
            Горизонтальный ход конем
            $whereFrom$whereTo$strokeNumber
        """.trimIndent()
    } else if (whereFromY + 2 == whereToY || whereFromY - 2 == whereToY && whereFromX + 1 == whereToX || whereFromX - 1 == whereToX && whereFromX in 1..8 && whereToX in 1..8 && whereFromY in 1..8 && whereToY in 1..8) {
        return """
            Вертикальный ход конем
            $whereFrom$whereTo$strokeNumber
        """.trimIndent()
    } else return "Невозможный ход"


//  Y
//  ^  18 28 38 48 58 68 78 88
//  |  17 27 37 47 57 67 77 87
//  |  16 26 36 46 56 66 76 86
//  |  15 25 35 45 55 65 75 85
//  |  14 24 34 44 54 64 74 84
//  |  13 23 33 43 53 63 73 83
//  |  12 22 32 42 52 62 72 82
//  |  11 21 31 41 51 61 71 81
//  *-------------------------> X

}