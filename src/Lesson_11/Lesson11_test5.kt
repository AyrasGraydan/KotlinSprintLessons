package Lesson_11

fun main() {
    val forum = Forum(mutableListOf(), mutableListOf())

    forum.createNewUser("ayras")
    forum.createNewUser("avelin")

    forum.createNewMassage(1, "Хай!")
    forum.createNewMassage(2, "Привет")

    forum.createNewMassage(3, "такого id нет")

    forum.printThread()
}

class ForumUser(val userId: Int, val userName: String)

class ForumMassage(val authorId: Int, val massage: String)

var lastId = 0

class Forum(val users: MutableList<ForumUser>, val massages: MutableList<ForumMassage>) {

    fun createNewUser(userName: String): ForumUser {
        lastId++
        val newUser = ForumUser(lastId, userName)
        users.add(newUser)
        return newUser
    }

    fun createNewMassage(authorId: Int, massage: String): ForumMassage? {
        val newMassage: ForumMassage
        users.forEach {
            if (it.userId == authorId) {
                newMassage = ForumMassage(authorId, massage)
                massages.add(newMassage)
                return newMassage
            }
        }
        return null
    }

    fun printThread() {
        massages.forEach { massage ->
            for (user in users) {
                if (massage.authorId == user.userId) {
                    println("${user.userName}: ${massage.massage}")
                    break
                }
            }
        }
    }
}
