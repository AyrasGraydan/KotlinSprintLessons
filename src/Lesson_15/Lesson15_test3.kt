package Lesson_15

fun main() {
    val user = User("aldor", "\"avatar\"", 1)
    val admin = Administrator("aragorn", "\"avatar\"", 2)

    user.readeForum()
    user.write("привет")
    println()

    admin.readeForum()
    admin.write("пока")
    admin.deleteMessage(1)
}

abstract class ForumParticipant(val name: String, val avatar: String, val id: Int) {

    fun readeForum() {
        println("$name читает форум")
    }

    fun write(message: String) {
        println("$name написал: $message")
    }
}

class User(name: String, avatar: String, id: Int) : ForumParticipant(name, avatar, id)

class Administrator(name: String, avatar: String, id: Int) : ForumParticipant(name, avatar, id) {

    fun deleteMessage(messageId: Int) {
        println("$name удалил сообщение с id: $messageId")
    }
}