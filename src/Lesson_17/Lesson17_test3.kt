package Lesson_17

fun main() {
    val directory1 = Directory("user", 32)
    val directory2 = Directory("user", 32, true)

    println(directory1.name)
    println(directory2.name)
}

class Directory(name: String, numberOfFiles: Int, val isSecret: Boolean = false) {

    val name = Pair(name, numberOfFiles)
        get() = if (isSecret) Pair("скрытая директория", 0) else field
}