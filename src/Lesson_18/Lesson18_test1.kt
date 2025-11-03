package Lesson_18

fun main() {
    val product1 = "боинг"
    val product2 = listOf("магический посох", "аниме волшебница", "книга магии")
    val order1 = Order(0)
    val order2 = Order(1)

    order1.printOrderInfo(product1)
    println()
    order2.printOrderInfo(product2)
}

class Order(val number: Int) {

    fun printOrderInfo(product: String) {
        println("#$number Заказан товар: $product")
    }

    fun printOrderInfo(products: List<String>) {
        println("#$number Заказаны следующие товары:")
        products.forEachIndexed { number, product -> println("${number + 1}. $product") }
    }
}