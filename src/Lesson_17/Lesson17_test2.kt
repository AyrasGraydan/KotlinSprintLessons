package Lesson_17

fun main() {
    val ship = Ship("avrora", 200, "vostock")
    ship.name = ""
}

class Ship(name: String, val averageSpeed: Int, val port: String) {

    var name = name
        set(value) {
            println("---Вы не можете изменить имя корабля---")
        }
}