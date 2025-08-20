package Lesson_2

const val MINUTE_IN_SECONDS = 60
const val DAY_IN_HOURS = 24

fun main() {

//    выехал в 9:39 и будет в пути 457 минут

    val hhDeparture = 9
    val mmDeparture = 39

    val travelTime = 457


    val mmAll = travelTime + hhDeparture * MINUTE_IN_SECONDS + mmDeparture

    val hhArrival = mmAll / MINUTE_IN_SECONDS
    val mmArrival = mmAll % MINUTE_IN_SECONDS

    println(String.format("%02d:%02d", hhArrival, mmArrival))

}
