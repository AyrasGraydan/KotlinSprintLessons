package Lesson_4

fun main() {

//    Упражнения для рук:    true
//    Упражнения для ног:    false
//    Упражнения для спины:  false
//    Упражнения для пресса: true

    var armExercises = true
    var legExercises = false
    var backExercises = false
    var abExercises = true

    val dayLast = 5

    armExercises = if (dayLast % 2 == 1) armExercises else !armExercises
    legExercises = if (dayLast % 2 == 1) legExercises else !legExercises
    backExercises = if (dayLast % 2 == 1) backExercises else !backExercises
    abExercises = if (dayLast % 2 == 1) abExercises else !abExercises

    println(
        """|Упражнения для рук:      $armExercises
        |Упражнения для ног:      $legExercises
        |Упражнения для спины:    $backExercises
        |Упражнения для пресса:   $abExercises
    """.trimMargin()
    )

}