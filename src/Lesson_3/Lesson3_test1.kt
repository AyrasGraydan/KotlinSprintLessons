package Lesson_3

import java.time.LocalTime

fun main() {

    val name = "Ayars"

    val currentTime = LocalTime.now()

    val hh = currentTime.hour


    val morningString = """
     Доброе утро?
     Что вы хотите этим сказать, $name?
     Просто желаете мне доброго утра? 
     Или утверждаете, что утро сегодня доброе — неважно,
     что я о нём думаю? 
     Или имеете в виду, что нынешним утром все должны быть добрыми?
"""
    val dayString = "Добрый день, $name!"
    val nightString = "Что не спим, $name?"

    when (hh) {
        in 4 until 12 -> println(morningString)
        in 12 until 22 -> println(dayString)
        in 22..24 -> println(nightString)
        in 0 until 4 -> println(nightString)
    }

}
