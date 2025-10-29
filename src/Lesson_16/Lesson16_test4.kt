package Lesson_16

fun main() {
    val order1 = Order(1)
    println(order1.status)
    println(order1.sendApplication(order1, "pls change the status of my order"))
    println(order1.status)
}

class Order(val number: Int, var status: Boolean = false) {

    private fun changeStatus(value: Boolean) = apply { status = value }

    fun sendApplication(numberOfOrder: Order, message: String): String {
        if ((1..10).random() > 2) {
            numberOfOrder.changeStatus(true)
            return "Ваша заявка принята"
        } else return "Ваша заявка отколонена"
    }
}
