package Lesson_18

fun main() {
    val dice1 = DiceSided4()
    val dice2 = DiceSided6()
    val dice3 = DiceSided8()

    val dices = listOf<Dice>(dice1, dice2, dice3)
    val results = mutableListOf<Int>()

    dices.forEach { dice -> results.add(dice.throwDice()) }
    println(results)
}

open class Dice() {
    open fun throwDice() = 0
}

class DiceSided4() : Dice() {
    override fun throwDice() = (1..4).random()
}

class DiceSided6() : Dice() {
    override fun throwDice() = (1..6).random()
}

class DiceSided8() : Dice() {
    override fun throwDice() = (1..8).random()
}