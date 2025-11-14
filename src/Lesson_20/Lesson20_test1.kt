package Lesson_20

fun main() {
    val splashScreen: (String) -> String = { username -> "С наступающим Новым Годом, $username!" }
    println(splashScreen("Avelin"))
}

