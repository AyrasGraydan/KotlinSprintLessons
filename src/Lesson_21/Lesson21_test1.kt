package Lesson_21

const val VOWELS_IN_ENGLISH = "aeiouy"

fun main() {
    val test = "AEIOUYaeiouy"

    println("Hello".vowelCount())
    println(test.vowelCount())
}

fun String.vowelCount() =
    this.lowercase().count { it in VOWELS_IN_ENGLISH }