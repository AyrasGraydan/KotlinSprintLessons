package Lesson_21

fun main() {
    val skills = mapOf("fencing" to 3, "mana reserve" to 5, "luck" to 5)
    println(skills.maxCategory())
}

fun Map<String, Int>.maxCategory(): String {
    val max = this.values.max()
    this.forEach { if (it.value == max) return it.key }
    return "error: Couldn't find a skill with maximum experience"
}