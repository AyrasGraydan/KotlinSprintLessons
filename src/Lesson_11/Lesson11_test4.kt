package Lesson_11

fun main() {
    val ingredient1 = Ingredient("творог", mapOf(200 to "г"))
    val ingredient2 = Ingredient("куриное яйцо", mapOf(2 to "шт"))
    val ingredient3 = Ingredient("мука", mapOf(2 to "ст.л"))
    val ingredient4 = Ingredient("масло", mapOf(3 to "ст.л"))
    val ingredient5 = Ingredient("сахар", mapOf(2 to "ст.л"))
    val ingredients = listOf(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5)
    val dish1 = Dish(
        0,
        "бургер с сыром",
        "\'катринка бургера\'",
        "бургеры",
        ingredients
    )
    val category1 = Category(
        "бургеры",
        "\'катринка бургера\'",
        mutableListOf(dish1)
    )
}

class Ingredient(
    val name: String,
    val portion: Map<Int, String>,
)

class Dish(
    val id: Int,
    val name: String,
    val avatar: String,
    val category: String,
    val ingredients: List<Ingredient>,
    var isFavorite: Boolean = false,
) {
    fun addToFavorites() {
        println("Блюдо $name добавлено в избранное")
        isFavorite = true
    }

    fun removeToFavorites() {
        println("Блюдо $name удалено из избранного")
        isFavorite = false
    }

    fun startCooking(numberOfPortion: Int) {
        println("Пользователь перешел на экран готовки:")
        println("Количество блюд: $numberOfPortion")

        val portions = mutableListOf<String>()
        ingredients.forEach {
            portions.add(it.portion.entries.joinToString { (key, value) -> "${key * numberOfPortion} - $value" })
        }
        ingredients.forEachIndexed { index, ingredient ->
            println("${index + 1}: ${ingredient.name} ${portions[index]}")
        }
    }

    fun downloadIngredients() = ingredients
}

class Category(
    val name: String,
    val avatar: String,
    val dish: MutableList<Dish>
) {
    fun downloadDishes() = dish
}
