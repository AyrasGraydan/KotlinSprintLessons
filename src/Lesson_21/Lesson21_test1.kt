package Lesson_21

const val VOWELS_IN_ENGLISH = "aeiouy"

fun main() {
    val test = "AEIOUYaeiouy"

    println("Hello".vowelCount1())
    println(test.vowelCount1())
}

fun String.vowelCount1() =
    this.lowercase().filter { VOWELS_IN_ENGLISH.contains(it) }.length
