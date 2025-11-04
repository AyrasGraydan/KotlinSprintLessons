package Lesson_18

fun main() {
    val animal1 = Cat("Avraeratiran")
    val animal2 = Fox("Snowy")
    val animal3 = Dog("Roys")
    val animals = listOf<Animal>(animal1, animal2, animal3)

    animals.forEach { it.eat() }
}

abstract class Animal(val name: String) {
    fun sleep() {
        println("$name -> спит")
    }

    abstract fun eat()
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}