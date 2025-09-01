package Lesson_4

fun main() {

    val dayNumber = 5

    val isEven = dayNumber % 2 == 0

    println(
        """|Упражнения для рук:      ${!isEven}
        |Упражнения для ног:      $isEven
        |Упражнения для спины:    $isEven
        |Упражнения для пресса:   ${!isEven}
    """.trimMargin()
    )

}