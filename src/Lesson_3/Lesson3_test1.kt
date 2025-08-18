package Lesson_3

import java.time.LocalTime

fun main() {

//    утро 4:00 до 12:00
//    день 12:00 до 22:00
//    ночь 22:00 до 4:00

    val name = "Ayars"

    val currentTime = LocalTime.now()

    var hh = currentTime.hour


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

//    val currentDate = sdf.format(Date())

//    SimpleDateFormat("dd/M/yyyy hh:mm:ss")

//    dd: День месяца (01-31)
//    M: Номер месяца в году (1-12). Рекомендуется MM.
//    yyyy: Год (четыре цифры)
//    hh: Час (01-12, AM/PM)
//    mm: Минуты (00-59)
//    ss: Секунды (00-59)

}
