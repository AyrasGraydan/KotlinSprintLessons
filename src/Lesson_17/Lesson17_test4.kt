package Lesson_17

fun main() {
    val package1 = Package(1, "otsoCity")
    println("${package1.currentLocation} ${package1.displacementGrid}")

    package1.currentLocation = "London"
    println("${package1.currentLocation} ${package1.displacementGrid}")

    package1.currentLocation = "A"
    println("${package1.currentLocation} ${package1.displacementGrid}")
}

class Package(var number: Int, currentLocation: String, var displacementGrid: Int = 0) {

    var currentLocation: String = currentLocation
        set(value) {
            displacementGrid++
            field = value
        }
}