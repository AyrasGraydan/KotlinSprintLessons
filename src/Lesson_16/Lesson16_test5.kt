package Lesson_16

fun main() {
    val player1 = Player("avelin", 430, 140)
    val player2 = Player("ayras", 640, 170)

    player1.takeDamage(player2.getStrength())
    player2.takeDamage(player1.getStrength())
    player2.takeDamage(player1.getStrength())
    player1.regenerate(100)
    player2.regenerate(20)
    player1.takeDamage(player2.getStrength())
    player2.takeDamage(player1.getStrength())
    player2.takeDamage(player1.getStrength())
    player1.takeDamage(player2.getStrength())
    player1.takeDamage(player2.getStrength())

    println("Здоровье игрока ${player1.name} ${player1.getHealth()}")
    println("Здоровье игрока ${player2.name} ${player2.getHealth()}")
    println()
    player1.regenerate(500)
    player2.regenerate(500)

    println("Здоровье игрока ${player1.name} после регенерации ${player1.getHealth()}")
    println("Сила игрока ${player1.name} после смерти ${player1.getStrength()}")
    println("Здоровье игрока ${player2.name} после регенерации ${player2.getHealth()}")
}

class Player(val name: String, private var health: Int, private var strength: Int) {

    fun getHealth() = health

    fun getStrength() = strength

    fun takeDamage(value: Int) {
        health -= value
        checkHealth()
    }

    fun regenerate(value: Int) {
        if (health > 0)
            health += value
        checkHealth()
    }

    private fun checkHealth() {
        if (health <= 0) {
            health = 0
            strength = 0
        }
    }
}