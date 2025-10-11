package Lesson_1_10.Lesson_3

fun main() {

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

}

