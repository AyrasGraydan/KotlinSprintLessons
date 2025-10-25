package Lesson_14

fun main() {
    val titan = Satellite("titan", 504, false, true)
    val enceladus = Satellite("enceladus", 5152, true, false)
    val jupiter = Planet(
        "titan",
        58232, true,
        false,
        listOf(titan, enceladus)
    )

    println(jupiter.name)
    jupiter.satellites.map { it.name }.forEach { println(" -$it") }
}

open class CelestialBodies(
    val name: String,
    val size: Int,
    val isHaveAtmosphere: Boolean,
    val isSuitableForLanding: Boolean
)

class Planet(
    name: String,
    size: Int,
    isHaveAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    val satellites: List<Satellite>
) : CelestialBodies(name, size, isHaveAtmosphere, isSuitableForLanding)

class Satellite(
    name: String,
    size: Int,
    isHaveAtmosphere: Boolean,
    isSuitableForLanding: Boolean
) : CelestialBodies(name, size, isHaveAtmosphere, isSuitableForLanding)