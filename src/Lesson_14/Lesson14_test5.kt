package Lesson_14

fun main() {
    val discord = Chat("", mutableListOf())
    discord.addMessage("Привет")
    discord.addMessage("Хай!")
    discord.addThreadMessage(1, "Пока")
    discord.addMessage("Пока")
    discord.addThreadMessage(4, "Пока!!!")
    discord.addThreadMessage(4, "🍇")

    discord.printChat()
}

var lastId = 0

open class Message(val id: Int, val message: String)
class ChildMessage(
    id: Int, message: String,
    val parentMessageId: Int
) : Message(id, message)

class Chat(val name: String, val messages: MutableList<Message>) {

    fun addMessage(message: String) {
        lastId++
        messages.add(Message(lastId, message))
    }

    fun addThreadMessage(parentMessageId: Int, message: String) {
        messages.forEach {
            if (it.id == parentMessageId) {
                lastId++
                messages.add(ChildMessage(lastId, message, parentMessageId))
                return
            }
        }
    }

    fun printChat() {
        val chatMassages =
            (messages.filter { it !is ChildMessage } as List<Message>).groupBy { it.id }
        val chatChildMessage =
            (messages.filter { it is ChildMessage } as List<ChildMessage>).groupBy { it.parentMessageId }

        chatMassages.forEach { (id, message) ->
            message.forEach { println(it.message) }
            chatChildMessage[id]?.forEach { println("\t${it.message}") }
        }
    }
}
