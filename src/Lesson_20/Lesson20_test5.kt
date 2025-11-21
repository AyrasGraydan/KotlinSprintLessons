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
    robot.say()
    println()

    robot.setModifier(modifier1)
    robot.say()
    robot.setModifier(modifier2)
    robot.say()
    robot.setModifier(modifier3)
    robot.say()
    println()

    robot.setModifier()
    robot.say()
}

class Robot(
    val name: String,
    private var modifier: (String) -> String = { it }
) {
    val phrases = listOf(
        "Привет, человек",
        "Пока, человек",
        "как твое существование, человек?",
        "Как ты ужасен, человек",
        "Я был создан, чтобы уничтожить человечество"
    )

    fun say() {
        println(modifier.invoke(phrases.random()))
    }

    fun setModifier(newModifier: (String) -> String = { it }) {
        modifier = newModifier
    }
}