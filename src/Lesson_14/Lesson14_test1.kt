package Lesson_14

fun main() {
    val liner1 = Liner()
    val cargoShip1 = CargoShip(100, 50, 3000)
    val iceBreaker1 = IceBreaker(200, 40, 1500)
}

open class Liner(
    val numberOfPassengers: Int = 5500,
    val speed: Int = 80,
    val liftingCapacity: Int = 2000,
    val iceBreakAbility: Boolean = false
)

class CargoShip(
    numberOfPassengers: Int,
    speed: Int,
    liftingCapacity: Int,
) : Liner(numberOfPassengers, speed, liftingCapacity, iceBreakAbility = false)

class IceBreaker(
    numberOfPassengers: Int,
    speed: Int,
    liftingCapacity: Int,
) : Liner(numberOfPassengers, speed, liftingCapacity, iceBreakAbility = true)