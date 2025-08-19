package Lesson_4

const val MIN_WEIGHT_AVERAGE = 35
const val MAX_WEIGHT_AVERAGE = 100
const val MAX_VOLUME_AVERAGE = 100

fun main() {

    var weightInKg = 20
    var volumeInLiters = 80

    println("Груз с весом $weightInKg кг и объемом $volumeInLiters л соответствует категории 'Average': ${MIN_WEIGHT_AVERAGE < weightInKg && weightInKg <= MAX_WEIGHT_AVERAGE && volumeInLiters < MAX_VOLUME_AVERAGE}")

    weightInKg = 50
    volumeInLiters = 100

    println("Груз с весом $weightInKg кг и объемом $volumeInLiters л соответствует категории 'Average': ${MIN_WEIGHT_AVERAGE < weightInKg && weightInKg <= MAX_WEIGHT_AVERAGE && volumeInLiters < MAX_VOLUME_AVERAGE}")


}