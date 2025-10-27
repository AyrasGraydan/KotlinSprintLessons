package Lesson_15

fun main() {
    val truck = Track(1, maxNumberOfCargo = 2000)
    val car1 = Car(3)
    val car2 = Car(3)

    truck.addCargo(2500)
    truck.addPassengers(1)
    car1.addPassengers(3)
    car2.addPassengers(3)

    car2.removePassenger(1)

    truck.startEngine()
    truck.startOfMovement()
    truck.completeTheMovements()
    truck.turnOffEngine()
    println()

    car1.startEngine()
    car1.startOfMovement()
    car1.completeTheMovements()
    car1.changeGear()
    car1.turnOffEngine()
    println()

    car2.startEngine()
    car2.startOfMovement()
    car2.completeTheMovements()
    car2.changeGear()
    car2.turnOffEngine()
    println()

    println("Груз: ${truck.currentNumberOfCargo}")
    val numberOfPassengers = listOf(
        truck.currentNumberOfPassengers,
        car1.currentNumberOfPassengers,
        car2.currentNumberOfPassengers
    )
    println("Пассажиры: ${numberOfPassengers.sum()}")
}

class Track(
    override val maxNumberOfPassengers: Int,
    override var currentNumberOfPassengers: Int = 0,
    override val maxNumberOfCargo: Int,
    override var currentNumberOfCargo: Int = 0
) : MovementOfTransport, TransportationOfPassengers, TransportationOfCargo

class Car(
    override val maxNumberOfPassengers: Int,
    override var currentNumberOfPassengers: Int = 0,
) : MovementOfTransport, TransportationOfPassengers

interface MovementOfTransport {

    fun startEngine() {
        println("Двигатель заведен")
    }

    fun startOfMovement() {
        println("Машина начала движения")
    }

    fun completeTheMovements() {
        println("Машина остановилась движения")
    }

    fun turnOffEngine() {
        println("Двигатель заглушен")
    }

    fun changeGear() {
        println("Передача переключена")
    }
}

interface TransportationOfPassengers {
    val maxNumberOfPassengers: Int
    var currentNumberOfPassengers: Int

    fun addPassengers(numberOfPassengers: Int) {
        currentNumberOfPassengers += numberOfPassengers
            .coerceAtMost(maxNumberOfPassengers).coerceAtLeast(0)
    }

    fun removePassenger(numberOfPassengers: Int) {
        currentNumberOfPassengers -= numberOfPassengers
            .coerceAtMost(maxNumberOfPassengers).coerceAtLeast(0)
    }
}

interface TransportationOfCargo {
    val maxNumberOfCargo: Int
    var currentNumberOfCargo: Int

    fun addCargo(numberOfCargo: Int) {
        currentNumberOfCargo += numberOfCargo
            .coerceAtMost(maxNumberOfCargo).coerceAtLeast(0)
    }

    fun removeCargo(numberOfCargo: Int) {
        currentNumberOfCargo -= numberOfCargo
            .coerceAtMost(maxNumberOfCargo).coerceAtLeast(0)
    }
}