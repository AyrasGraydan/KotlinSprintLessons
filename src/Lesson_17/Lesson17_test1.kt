package Lesson_17

fun main() {
    val quiz1 = Quiz("Что ты делал?", "Спал")
    println(quiz1.question)
    println(quiz1.answer)
    quiz1.answer = "Не спал"
    println(quiz1.answer)
}

class Quiz(question: String, answer: String) {

    var question = question
        get() = field

    var answer = answer
        get() = field
        set(value) {
            field = value
        }
}