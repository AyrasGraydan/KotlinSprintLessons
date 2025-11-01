package Lesson_17

fun main() {
    val ship = Ship1("avrora", 200, "vostock")
    ship.name = ""
}

class Ship1(name: String, val averageSpeed: Int, val port: String) {

    var name = name
        set(value) {
            println("---Вы не можете изменить имя корабля---")
        }
}
