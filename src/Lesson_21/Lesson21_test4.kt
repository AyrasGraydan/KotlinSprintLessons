package Lesson_21

import java.io.File

fun main() {
    val testFile = File("file.txt")
    testFile.createNewFile()

    testFile.writeText("")

    testFile.writeTextLowercase("это 2")
    testFile.writeTextLowercase("это БУДЕТ 1 строка ---- ")
    println(testFile.readText())
}

fun File.writeTextLowercase(text: String) {
    writeText(text.lowercase() + "\n" + readText())
}