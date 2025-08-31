package Lesson_4

fun main() {

    var armExercises = true
    var legExercises = false
    var backExercises = false
    var abExercises = true

    val dayNumber = 5

    val isEven =  if (dayNumber % 2 == 0) true else false

    if (isEven){
        armExercises = !armExercises
        legExercises = !legExercises
        backExercises = !backExercises
        abExercises = !abExercises
    }

    println(
        """|Упражнения для рук:      $armExercises
        |Упражнения для ног:      $legExercises
        |Упражнения для спины:    $backExercises
        |Упражнения для пресса:   $abExercises
    """.trimMargin()
    )

}