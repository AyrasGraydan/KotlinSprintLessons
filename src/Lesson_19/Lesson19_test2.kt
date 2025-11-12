package Lesson_19

fun main() {
    val product1 = Product("футболка", 0, ProductCategory.CLOTHING)
    val product2 = Product("ручка", 1, ProductCategory.STATIONERY)

    product1.printInfo()
    println()
    product2.printInfo()
}

class Product(val name: String, val id: Int, val category: ProductCategory) {
    fun printInfo() {
        println("Название: $name\nid: $id\n${category.getCategoryString()}")
    }
}

enum class ProductCategory(val categoryName: String) {
    CLOTHING("одежда"),
    STATIONERY("канцелярия"),
    MISCELLANEOUS("разное");

    fun getCategoryString() = "Категория: $name"
}