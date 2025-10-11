package Lesson_1_10.Lesson_1

fun main() {

//    – количество заказов,
//    – текст с благодарностью за покупку (текст на твое усмотрение).

    val itemsInBasket: UShort = 75u
    // количество товаров не может быть отрицательным
    // количество товаров наврядли превысит 30 000

    val thankText: String = "Благодарим за покупку!"

    println(thankText)
    println("Количество товаров в корзине: $itemsInBasket")

}