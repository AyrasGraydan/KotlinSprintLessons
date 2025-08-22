package Lesson_3

import java.time.LocalTime

fun main() {

    val name = "Ayars"

    val currentTime = LocalTime.now()

    val hh = currentTime.hour

    val morningStringPart1 = """
    |Доброе утро?
    |Что вы хотите этим сказать""".trimMargin()

    val morningStringPart2 = """
    |Просто желаете мне доброго утра? 
    |Или утверждаете, что утро сегодня доброе — неважно,
    |что я о нём думаю? 
    |Или имеете в виду, что нынешним утром все должны быть добрыми?""".trimMargin()

    val dayString = "Добрый день"
    val nightString = "Что не спим"

    when (hh) {
        in 4 until 12 -> println("$morningStringPart1, $name? \n$morningStringPart2")
        in 12 until 22 -> println("$dayString, $name!")
        in 22..24 -> println("$nightString, $name?")
        in 0 until 4 -> println("$nightString, $name?")
    }

}
