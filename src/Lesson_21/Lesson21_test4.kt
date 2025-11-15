package Lesson_21

import java.io.File

fun main() {
    val testFile = File("file.txt")
    testFile.createNewFile()

    testFile.writeTextLowercase("TEST STRING\n")
    println(testFile.readText())

    testFile.writeTextLowercase("TEST string 2, функция перезаписывает прошлую версию файл")
    println(testFile.readText())
}

fun File.writeTextLowercase(text: String) {
    writeText(text.lowercase())
}

