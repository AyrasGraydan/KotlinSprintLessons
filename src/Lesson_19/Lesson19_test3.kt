package Lesson_19

fun main() {
    val spaceShip = SpaceShip("Avrora", SizeType.LEVIATHAN, 7500)
    spaceShip.takeOff()
    spaceShip.shootBackAtAsteroids()
    spaceShip.land()
}

class SpaceShip(
    val name: String,
    val size: SizeType,
    val speed: Int,
) {
    fun takeOff() {
        // TODO написать логику посадки
    }

    fun land() {
        // TODO написать логику приземления
    }

    fun shootBackAtAsteroids() {
        TODO("написать логику стрельбы по астероидам для SpaceShip")
    }
}

enum class SizeType {
    LEVIATHAN,
    LARGE,
    MEDIUM,
    SMALL,
}