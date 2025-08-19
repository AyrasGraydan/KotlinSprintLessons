package Lesson_4

fun main() {

    val minWeightAverage = 35
    val maxWeightAverage = 100
    val maxVolumeAverage = 100

    var weightInKg = 20
    var volumeInLiters = 80

    println("Груз с весом $weightInKg кг и объемом $volumeInLiters л соответствует категории 'Average': ${minWeightAverage < weightInKg && weightInKg <= maxWeightAverage && volumeInLiters < maxVolumeAverage}")

    weightInKg = 50
    volumeInLiters = 100

    println("Груз с весом $weightInKg кг и объемом $volumeInLiters л соответствует категории 'Average': ${minWeightAverage < weightInKg && weightInKg <= maxWeightAverage && volumeInLiters < maxVolumeAverage}")


}