package Lesson_2

fun main() {

    var crystal = 7
    var ironOre = 11

    var crystalBaff = (crystal * 1.2 - crystal).toInt()
    var ironOreBaff = (ironOre * 1.2 - ironOre).toInt()

    println("Вы получили +$crystalBaff \"кристалл\" от действия баффа")
    println("Вы получили +$ironOreBaff \"рудного железа\" от действия баффа")

}