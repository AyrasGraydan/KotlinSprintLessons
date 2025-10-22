package Lesson_14

fun main() {
    val liner1 = Liner("liner1")
    val cargoShip1 = CargoShip("cargoShip1", 100, 50, 3000)
    val iceBreaker1 = IceBreaker("iceBreaker1", 200, 40, 1500)
}

open class Liner(
    val name: String,
    val numberOfPassengers: Int = 5500,
    val speed: Int = 80,
    val liftingCapacity: Int = 2000,
    val iceBreakAbility: Boolean = false
)

class CargoShip(
    name: String,
    numberOfPassengers: Int,
    speed: Int,
    liftingCapacity: Int,
) : Liner(name, numberOfPassengers, speed, liftingCapacity, iceBreakAbility = false)

class IceBreaker(
    name: String,
    numberOfPassengers: Int,
    speed: Int,
    liftingCapacity: Int,
) : Liner(name, numberOfPassengers, speed, liftingCapacity, iceBreakAbility = true)