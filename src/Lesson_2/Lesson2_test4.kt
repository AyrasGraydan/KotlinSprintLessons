package Lesson_2

const val BAFF_BONUS = 0.2

fun main() {

    val crystal = 7
    val ironOre = 11

    val crystalBaff = (crystal * BAFF_BONUS).toInt()
    val ironOreBaff = (ironOre * BAFF_BONUS).toInt()

    println("Вы получили +$crystalBaff \"кристалл\" от действия баффа")
    println("Вы получили +$ironOreBaff \"рудное железо\" от действия баффа")

}