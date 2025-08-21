import java.io.IO.readln

const val ABSENCE_OF_DAMAGE = true
const val FAVORABLE_MIN_NUMBER_OF_CREW = 55
const val FAVORABLE_MAX_NUMBER_OF_CREW = 70
const val FAVORABLE_AMOUNT_OF_BOXES = 50
const val FAVORABLE_WEATHER = true

fun main() {

    val absenceOfDamage: Boolean = if (readln("Есть ли у корабля повреждения? да/skip ") == "да") false; else true
    val numberOfCrew: Int = readln("Kоличество экипажа на корабле: ").toInt()
    val amountOfBoxes: Int = readln("Kоличество ящиков провизи на корабле: ").toInt()
    val weather: Boolean = if (readln("Благоприятная ли погода? да/skip ") == "да") true; else false

    println()

    if ((absenceOfDamage == ABSENCE_OF_DAMAGE && numberOfCrew in FAVORABLE_MIN_NUMBER_OF_CREW..FAVORABLE_MAX_NUMBER_OF_CREW && amountOfBoxes > FAVORABLE_AMOUNT_OF_BOXES) or (numberOfCrew == 70 && amountOfBoxes >= 50 && weather == FAVORABLE_WEATHER))
        println("Корабль может отправится в плавание")
    else println("Корабль вероятно утонет")


}
