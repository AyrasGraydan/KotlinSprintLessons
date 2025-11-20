package Lesson_21

fun main() {
    val skills = mapOf("fencing" to 3, "mana reserve" to 5, "luck" to 5)
    println(mapOf<String, Int>().maxCategory())
    println(skills.maxCategory())
}

fun Map<String, Int>.maxCategory() = maxByOrNull { it.value }?.key