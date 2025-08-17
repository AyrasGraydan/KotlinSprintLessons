package Lesson_2

fun main() {

//    выехал в 9:39 и будет в пути 457 минут

    //variant 1

    val hhDeparture = 9
    val mmDeparture = 39

    val travelTime = 457



    val mmAll = travelTime + hhDeparture * 60 + mmDeparture

    val hhArrival = mmAll / 60
    val mmArrival = mmAll % 60

    println(String.format("%02d:%02d", hhArrival, mmArrival))


    //variant 2

    println(arrivalTime(9, 39, 457))

}

fun arrivalTime(hhDeparture: Int, mmDeparture: Int, travelTime: Int ): String {

    val mmAll = travelTime + hhDeparture * 60 + mmDeparture

    val hhArrival = mmAll / 60 % 24
    val mmArrival = mmAll % 60

    val day = mmAll / 60 / 24


    var stringTime: String

    when(day){


        0 -> stringTime = """
        
        Прибытие поезда: 
        Сегодня в ${String.format("%02d:%02d", hhArrival, mmArrival)}
        
    """.trimIndent()

        1 -> stringTime = """
        
        Прибытие поезда: 
        Завтра в ${String.format("%02d:%02d", hhArrival, mmArrival)}
        
    """.trimIndent()

        in 2 until 5 ->  stringTime = """
        
        Прибытие поезда: 
        Через $day дня в ${String.format("%02d:%02d", hhArrival, mmArrival)}
        
    """.trimIndent()

        else ->  stringTime = """
        
        Прибытие поезда: 
        Через $day дней в ${String.format("%02d:%02d", hhArrival, mmArrival)}
        
    """.trimIndent()

    }

    return stringTime

}