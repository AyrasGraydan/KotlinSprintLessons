package Lesson_19

import kotlin.collections.mutableListOf

fun main() {
    val cardIndex1 = CardIndex(mutableListOf())

    for (i in 0..4) {
        cardIndex1.addPeople()
        println()
    }

    cardIndex1.listOfPeople.forEach { it.printInfo() }
}

class CardIndex(val listOfPeople: MutableList<People>) {
    fun addPeople() {
        print("Введите имя: ")
        val name = readln()

        Gender.entries.forEach { println("${it.ordinal + 1}: ${it.name.lowercase()}") }
        print("Выберите пол: ")
        val entries = Gender.entries
        val ordinal = readln().toIntOrNull()?.minus(1) ?: 0
        val gender = if (ordinal in 0..<entries.size) entries[ordinal] else entries[0]

        listOfPeople.add(People(name, gender))
    }
}

class People(val name: String, val gender: Gender) {
    fun printInfo() {
        println("Имя: $name Пол: $gender")
    }
}

enum class Gender {
    NOT_SPECIFIED, MAN, WOMAN
}