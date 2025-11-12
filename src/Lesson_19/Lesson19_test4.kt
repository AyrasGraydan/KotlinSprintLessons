package Lesson_19

fun main() {
    val tank = Tank()

    tank.loadAmmo(Ammo.RED)
    tank.shoot()
    tank.loadAmmo(Ammo.BLUE)
    tank.shoot()
    tank.loadAmmo(Ammo.GREEN)
    tank.shoot()
    println()

    tank.amountOfRedAmmo = 0
    tank.loadAmmo(Ammo.RED)

    tank.takeAmmo(1, Ammo.RED)
    tank.shoot()
    tank.loadAmmo(Ammo.RED)
    tank.shoot()
}

class Tank(
    var currentAmmo: Ammo? = null,
    var amountOfBlueAmmo: Int = 50,
    var amountOfGreenAmmo: Int = 30,
    var amountOfRedAmmo: Int = 7,
) {
    fun takeAmmo(numberOfAmmo: Int, ammoType: Ammo) {
        when (ammoType) {
            Ammo.BLUE -> amountOfBlueAmmo += numberOfAmmo
            Ammo.GREEN -> amountOfGreenAmmo += numberOfAmmo
            Ammo.RED -> amountOfRedAmmo += numberOfAmmo
        }
    }

    fun loadAmmo(ammoType: Ammo) {
        when (ammoType) {
            Ammo.BLUE -> if (amountOfBlueAmmo > 0) currentAmmo =
                ammoType else println("снаряды данного типа отсутствуют")

            Ammo.GREEN -> if (amountOfGreenAmmo > 0) currentAmmo =
                ammoType else println("снаряды данного типа отсутствуют")

            Ammo.RED -> if (amountOfRedAmmo > 0) currentAmmo =
                ammoType else println("снаряды данного типа отсутствуют")
        }
    }

    fun shoot() {
        if (currentAmmo != null) println("Урон снаряда: ${currentAmmo!!.damage} Тип снаряда: ${currentAmmo!!.name}")
        else println("Вы не зарядили снаряд")
    }
}

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}