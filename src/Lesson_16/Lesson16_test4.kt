package Lesson_16

fun main() {
    val order1 = Order(1)
    println(order1.getStatus())
    println(order1.sendApplication("pls change the status of my order"))
    println(order1.getStatus())
}

class Order(private val number: Int, private var status: Boolean = false) {

    private fun changeStatus(value: Boolean) = apply { status = value }
    fun getStatus() = status

    fun sendApplication(message: String): String {
        if ((1..10).random() > 2) {
            this.changeStatus(true)
            return "Ваша заявка принята"
        } else return "Ваша заявка отколонена"
    }
}
