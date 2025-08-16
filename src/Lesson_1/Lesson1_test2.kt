package Lesson_1

fun main() {

//    – количество заказов,
//    – текст с благодарностью за покупку (текст на твое усмотрение).

    val itemsInBasket: UShort = 75u
    // количество товаров не может быть отрицательным
    // количество товаров наврядли превысит 30 000

    val thankText: String = "Благодарим за покупку!"

    var numberOfEmployees: UShort  = 2000u
    // количество сотрудников не может быть отрицательным
    // количество сотрудников наврядли превысит 30 000


    println(thankText)
    println("Количество товаров в корзине: $itemsInBasket")

//    println("Чилсо сотрудников: $numberOfEmployees")

    numberOfEmployees = (2000 - 1).toUShort()
    println("Чилсо сотрудников: $numberOfEmployees")

}