package Lesson_15

fun main() {
    val duck = Duck("утка", 20, 10, 30)
    val seagull = Seagull("чайка", 30, 15, 25)
    val crucianCarp = CrucianCarp("карась", 15, 30, 20)

    duck.takeOff()
    duck.swoopDown()
    duck.land()
    duck.goDeeper()
    duck.goUpwards()
    println()

    seagull.takeOff()
    seagull.swoopDown()
    seagull.land()
    println()

    crucianCarp.goDeeper()
    crucianCarp.goUpwards()
}


class CrucianCarp(override val name: String, health: Int, var stamina: Int, size: Int)
    : Floating {}

class Seagull(override val name: String, health: Int, var stamina: Int, size: Int)
    : Flying{
}

class Duck(override val name: String, health: Int, var stamina: Int, size: Int)
    : Flying, Floating{
}

interface Flying {
    val name: String

    fun takeOff(){
        println("$name расправила крыль и взлетела")
    }
    fun land(){
        println("$name приземлилась и сложила крылья")
    }
    fun swoopDown(){
        println("$name начала пикирование")
    }
}

interface Floating {
    val name: String

    fun goDeeper(){
        println("$name начал погружатся")
    }
    fun goUpwards(){
        println("$name начал движение к поверхности")
    }

}