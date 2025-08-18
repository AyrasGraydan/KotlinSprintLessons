package Lesson_3

fun main() {

    val coordinate = "D2-D4;0"

    val whereFrom = coordinate[0].toString() + coordinate[1]
    val whereTo = coordinate[3].toString() + coordinate[4]
    val strokeNumber = coordinate[6]

    println(whereFrom)
    println(whereTo)
    println(strokeNumber)




//    find() — возвращает первое совпадение регулярного выражения в строке в виде объекта MatchResult или null, если совпадение не найдено.
//    findAll() — возвращает все совпадения в строке, возвращает последовательность объектов MatchResult.
//    replace() — заменяет все совпадения регулярного выражения в строке указанной строкой замены.
//    split() — разделяет строку по совпадениям регулярного выражения.

}