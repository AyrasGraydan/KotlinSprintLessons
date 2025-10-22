package Lesson_13

fun main() {

    val telephoneBook = TelephoneBook(
        mutableListOf(
            User4("John", 142141253312L, "YouTube"), User4("Marin", 1L)
        )
    )

    telephoneBook.addUser()
    println()
    telephoneBook.printInfo()
}

class User4(
    val name: String, val telephone: Long, val company: String? = null
) {
    fun printInfo() {
        println("Имя: $name \nТел: $telephone \nКомпания: ${company ?: "<не указано>"}")
    }
}

class TelephoneBook(val telephoneBook: MutableList<User4>) {
    fun addUser() {
        print("Введите имя: ")
        val name = readln()
        print("Введите номер: ")
        val telephone = readln().toLongOrNull()
        print("Введите компанию: ")
        var company: String? = readln()

        if (company?.isEmpty() == true) company = null

        if (telephone != null) telephoneBook.add(User4(name, telephone, company))
        else println("Вы не указали номер телефона, пользователь не был добавлен")
    }

    fun printInfo() {
        telephoneBook.forEach {
            it.printInfo()
            println()
        }
    }
}