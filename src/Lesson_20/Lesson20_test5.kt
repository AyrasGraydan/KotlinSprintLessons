package Lesson_20

fun main() {
    val modifier1 = { phrase: String ->
        val words = phrase.split(' ')
        words.reversed().joinToString(" ")
    }
    val modifier2 = { phrase: String ->
        val words = phrase.split(' ')
        val phraseModified = mutableListOf<String>()
        words.forEach { phraseModified.add(it.reversed()) }
        phraseModified.joinToString(" ")
    }
    val modifier3 = { phrase: String ->
        val phraseModified = phrase.split(' ')
            .map {
                var word = ""
                val length = it.length
                repeat(length) { word += length }
                word
            }
        phraseModified.joinToString(" ")
    }
    val hello = "Привет, человек"
    val bye = "Пока, человек"
    val howAreYou = "как твое существование, человек?"
    val sayNasty = "Как ты ужасен, человек"
    val sayPlan = "Я был создан, чтобы уничтожить человечество"

    val robot = Robot("d720")
    robot.say(sayPlan)
    println()

    robot.setModifier(modifier1)
    robot.say(sayPlan)
    robot.setModifier(modifier2)
    robot.say(sayPlan)
    robot.setModifier(modifier3)
    robot.say(sayPlan)
    println()

    robot.setModifier()
    robot.say(howAreYou)
}

class Robot(
    val name: String,
    private var modifier: (String) -> String = { it }
) {
    fun say(phrase: String) {
        println(modifier.invoke(phrase))
    }

    fun setModifier(newModifier: (String) -> String = { it }) {
        modifier = newModifier
    }
}


