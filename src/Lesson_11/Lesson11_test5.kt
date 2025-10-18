package Lesson_11

val forum = Forum(mutableListOf(), mutableListOf())


fun main() {
    ForumUser.userName("ayras").createNewUser()
    ForumUser.userName("avelin").createNewUser()

    ForumMassage.authorId(1).massage("Хай!").createNewMassage()
    ForumMassage.authorId(2).massage("Привет").createNewMassage()

    println(ForumMassage.authorId(3).massage("Такого Id нет").createNewMassage())
    println()

    forum.printThread()
}

class ForumMassage(val authorId: Int, val massage: String) {

    companion object Builder {
        var userId: Int = 0
        lateinit var massage: String

        fun authorId(value: Int) = apply { userId = value }
        fun massage(value: String) = apply { massage = value }

        fun createNewMassage(): ForumMassage? {
            lateinit var newMassage: ForumMassage
            forum.users.forEach {
                if (it.userId == userId) {
                    newMassage = ForumMassage(userId, massage)
                    forum.massages.add(newMassage)
                    return newMassage
                }
            }
            return null
        }
    }
}

var lastId = 0

class ForumUser(val userId: Int, val userName: String) {

    companion object Builder {
        lateinit var userName: String

        fun userName(value: String) = apply { userName = value }

        fun createNewUser(): ForumUser {
            lastId++
            val newUser = ForumUser(lastId, userName)
            forum.users.add(newUser)
            return newUser
        }
    }
}

class Forum(val users: MutableList<ForumUser>, val massages: MutableList<ForumMassage>) {

    fun printThread() {
        forum.massages.forEach { massage ->
            for (user in forum.users) {
                if (massage.authorId == user.userId) {
                    println("${user.userName}: ${massage.massage}")
                    break
                }
            }
        }
    }
}
