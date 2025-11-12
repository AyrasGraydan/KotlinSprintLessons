package Lesson_18

fun main() {
    val dice1 = DiceSided4()
    val dice2 = DiceSided6()
    val dice3 = DiceSided8()

    val dices = listOf<Dice>(dice1, dice2, dice3)

    dices.forEach { it.throwDice() }
}

abstract class Dice(val faces: Int) {
    open fun throwDice() {
        println("Кубик показал: ${(1..faces).random()}")
    }
}

class DiceSided4 : Dice(4)
class DiceSided6 : Dice(6)
class DiceSided8 : Dice(8)