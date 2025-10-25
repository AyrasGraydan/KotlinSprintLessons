package Lesson_14

fun main() {
    val discord = Chat("", mutableListOf())

    discord.addMessage("Привет")
    discord.addMessage("Хай!")
    discord.addThreadMessage(1, "Пока")

    discord.addMessage("Пока")
    discord.addThreadMessage(1, "Пока!")
    discord.addThreadMessage(4, "🍇")

    discord.printChat()
}
var lastId = 0

class Message(val id: Int, val message: String)
class ChildMessage(val id: Int, val parentMessageId: Int, val message: String)

class Chat(val name: String, val messages: MutableList<Any>) {

    fun addMessage(message: String) {
        lastId++
        messages.add(Message(lastId, message))
    }
    fun addThreadMessage(parentMessageId: Int, message: String) {
        messages.forEach {
            if (it is Message)
                if (it.id == parentMessageId) {
                    lastId++
                    messages.add(ChildMessage(lastId, parentMessageId, message))
                    return
                }
        }
    }
    fun printChat() {
        val chatMassages =
            (messages.filter { it is Message } as List<Message>).groupBy { it.id }
        val chatChildMessage =
            (messages.filter { it is ChildMessage } as List<ChildMessage>).groupBy { it.parentMessageId }

        chatMassages.forEach { (id, message) ->
            message.forEach { println(it.message) }
                chatChildMessage[id]?.forEach { println("\t${it.message}") }
        }
    }
}
