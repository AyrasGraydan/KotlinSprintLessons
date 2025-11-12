package Lesson_19

fun main() {
    println("Вы можете добавить в аквариум следующих рыб:")
    Fish.entries.forEach { println("#${it.ordinal + 1} ${it.typeOfFish}") }
}

enum class Fish(val typeOfFish: String) {
    GUPPY("гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("золотая рыбка"),
    SIAMESE_FIGHTING_FISH("петушок");
}