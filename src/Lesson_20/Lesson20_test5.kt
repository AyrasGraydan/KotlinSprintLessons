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

    val robot = Robot("d720")
    robot.say(RobotPhrase.SAY_A_PLAN)
    println()

    robot.setModifier(modifier1)
    robot.say(RobotPhrase.SAY_A_PLAN)
    robot.setModifier(modifier2)
    robot.say(RobotPhrase.SAY_A_PLAN)
    robot.setModifier(modifier3)
    robot.say(RobotPhrase.SAY_A_PLAN)
    println()

    robot.setModifier(null)
    robot.say(RobotPhrase.HOW_ARE_YOU)
}

class Robot(
    val name: String,
    private var currentModifier: ((String) -> String)? = null
) {
    fun say(phrase: RobotPhrase) {
        if (currentModifier != null)
            println(currentModifier?.invoke(phrase.body))
        else println(phrase.body)
    }

    fun setModifier(modifier: ((String) -> String)? = null) {
        currentModifier = modifier
    }
}

enum class RobotPhrase(val body: String) {
    Hello("Привет, человек"),
    Bye("Пока, человек"),
    HOW_ARE_YOU("как твое существование, человек?"),
    SAY_NASTY("Как ты ужасен, человек"),
    SAY_A_PLAN("Я был создан, чтобы уничтожить человечество"),
}


