package Lesson_2

const val BAFF_BONUS = 20
const val FULL_PERCENTAGE = 100

fun main() {

    val crystal = 7
    val ironOre = 11

    val crystalBaff = (crystal * BAFF_BONUS / FULL_PERCENTAGE).toInt()
    val ironOreBaff = (ironOre * BAFF_BONUS / FULL_PERCENTAGE).toInt()

    println("Вы получили +$crystalBaff \"кристалл\" от действия баффа")
    println("Вы получили +$ironOreBaff \"рудное железо\" от действия баффа")

}