package Lesson_20

fun main() {
    val drinkHealingPotion: (User, HealingPotion) -> String = { user, potion ->
        user.currentHp = (user.currentHp + user.maxHp / 100 * potion.healingPercentage)
            .coerceAtMost(user.maxHp).coerceAtLeast(0)
        "${user.name} исцелил свое здоровье c помощью \"${potion.potionName}\""
    }

    val user = User("Astrorg", 740, 1)
    println(drinkHealingPotion(user, HealingPotion.SMALL_POTION))
    println(user.currentHp)
    println(drinkHealingPotion(user, HealingPotion.MEDIUM_POTION))
    println(user.currentHp)
    println(drinkHealingPotion(user, HealingPotion.BIG_POTION))
    println(user.currentHp)
}

class User(val name: String, val maxHp: Int, var currentHp: Int)

enum class HealingPotion(val potionName: String, val healingPercentage: Int) {
    SMALL_POTION("слабое зелье", 30),
    MEDIUM_POTION("умеренное зелье", 50),
    BIG_POTION("агрессивное зелье", 70)
}

