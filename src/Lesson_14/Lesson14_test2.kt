package Lesson_14

fun main() {
    val liner1 = Liner2("liner1")
    val cargoShip1 = CargoShip2("cargoShip1", 100, 50, 3000)
    val iceBreaker1 = IceBreaker2("iceBreaker1", 200, 40, 1500)

    liner1.startLoading()
    cargoShip1.startLoading()
    iceBreaker1.startLoading()
}

open class Liner2(
    val name: String,
    val numberOfPassengers: Int = 5500,
    val speed: Int = 80,
    val liftingCapacity: Int = 2000,
    val iceBreakAbility: Boolean = false
) {
    open fun startLoading() {
        println("$name: Трап для погрузки выдвинут")
    }
}

class CargoShip2(
    name: String,
    numberOfPassengers: Int,
    speed: Int,
    liftingCapacity: Int,
) : Liner2(name, numberOfPassengers, speed, liftingCapacity, iceBreakAbility = false) {
    override fun startLoading() {
        println("$name: Погрузочный кран активирован")
    }
}

class IceBreaker2(
    name: String,
    numberOfPassengers: Int,
    speed: Int,
    liftingCapacity: Int,
) : Liner2(name, numberOfPassengers, speed, liftingCapacity, iceBreakAbility = true) {
    override fun startLoading() {
        println("$name: Ворота для груза со стороны кормы открыты")
    }
}