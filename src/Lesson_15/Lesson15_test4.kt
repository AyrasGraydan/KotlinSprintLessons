package Lesson_15

fun main() {
    val component1 = Component("струна", 320)
    val component2 = Component("грифа", 120)
    val musicalInstrument = MusicalInstrument("гитара", 34)

    musicalInstrument.searchComponents()
}

abstract class Product(val name: String, val numberOfUnits: Int)

interface Search {

    fun searchComponents() {
        println("Выполнсяется поиск компонентов")
    }
}

class Component(name: String, numberOfUnits: Int) : Product(name, numberOfUnits)
class MusicalInstrument(
    name: String, numberOfUnits: Int
) : Product(name, numberOfUnits), Search