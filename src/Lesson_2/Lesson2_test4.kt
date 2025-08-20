package Lesson_2

const val BAFF_BONUS = 20

fun main() {

    val crystal = 7
    val ironOre = 11

    val crystalBaff = (crystal * BAFF_BONUS/100).toInt()
    val ironOreBaff = (ironOre * BAFF_BONUS/100).toInt()

    println("Вы получили +$crystalBaff \"кристалл\" от действия баффа")
    println("Вы получили +$ironOreBaff \"рудное железо\" от действия баффа")

}