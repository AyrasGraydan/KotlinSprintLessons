package Lesson_8


fun main() {

    val arrayOfIngredients = arrayOf("листья", "гренки", "пармезан", "соус", "мясо", "томаты")

    print("Введите названия блюда: ")
    val userIngredient = readln().lowercase()

    arrayOfIngredients.forEach { ingredients ->
        if (ingredients == userIngredient) {
            println("Ингредиент \"$userIngredient\" в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}
