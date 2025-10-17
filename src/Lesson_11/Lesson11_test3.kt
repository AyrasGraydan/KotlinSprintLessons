package Lesson_11

const val RED = "\u001B[31m"
const val GREEN = "\u001B[32m"
const val ORANGE = "\u001B[33m"
const val BLUE = "\u001B[34m"
const val PURPURE = "\u001B[35m"
const val TURQUOISE = "\u001B[36m"
const val GRAY = "\u001B[37m"
const val RESET_COLOR = "\u001B[0m"

val status = listOf("microph. off", "talking", "user muted")

const val avatarWidthToLength = 2.5

fun main() {
    val users = createUsers()
    val rooms = createRooms(users)
    var actionNumber: Int?
    var selectedRoom: Int?
    var userNumber: Int?
    var userName: String
    printHint()
    println()
    do {
        print(RED + "Какое действие выполнить: $RESET_COLOR")
        actionNumber = readln().toIntOrNull()
        when (actionNumber) {
            0 -> {
                printHint()
            }

            1 -> {
                println(BLUE + "Список комнат:$RESET_COLOR")
                rooms.forEachIndexed { index, room ->
                    println("${index + 1}. ${room.name}")
                }
            }

            2 -> {
                print("Введите номер комнаты 1 - ${rooms.size}: ")
                selectedRoom = readln().toIntOrNull()?.minus(1)
                if (selectedRoom in 0 until rooms.size && selectedRoom != null) {
                    println()
                    rooms[selectedRoom].printRoomCard()
                } else {
                    println("Номера с таким номером нет")
                    selectedRoom = 0
                }

                do {
                    println()
                    print(RED + "Какое действие комнаты выполнить: $RESET_COLOR")
                    actionNumber = readln().toIntOrNull()
                    when (actionNumber) {
                        0 -> printHint()
                        1 -> {
                            print("Введите номер участника: ")
                            userNumber = readln().toIntOrNull()?.minus(1)
                            if (userNumber in 0 until rooms[selectedRoom].users.size && userNumber != null)
                                rooms[selectedRoom].touchOnAvatar(userNumber)
                            else println("Участника с таким номером нет")
                        }

                        2 -> {
                            print("Введите имя: ")
                            userName = readln()
                            rooms[selectedRoom].getStatuses().forEachIndexed { index, status ->
                                println("${index + 1}. $status")
                            }
                            print("Введите номер нового статуса: ")
                            actionNumber = readln().toIntOrNull()?.minus(1)
                            if (actionNumber in 0 until rooms[selectedRoom].getStatuses().size && actionNumber != null) {
                                rooms[selectedRoom].setUserStatus(userName, actionNumber)
                                println("Статус обновлен")
                            } else println("Статуса с таким номером нет")
                        }

                        3 -> {
                            users.forEachIndexed { index, user ->
                                println("${index + 1}. ${user.name}")
                            }
                            print("Выберите, кого добавить: ")
                            userNumber = readln().toIntOrNull()?.minus(1)

                            rooms[selectedRoom].getStatuses().forEachIndexed { index, status ->
                                println("${index + 1}. $status")
                            }
                            print("Введите номер нового статуса: ")
                            actionNumber = readln().toIntOrNull()?.minus(1)

                            if (actionNumber in 0 until rooms[selectedRoom].getStatuses().size && actionNumber != null
                                && userNumber in 0 until users.size && userNumber != null
                            ) {
                                rooms[selectedRoom].addUser(users[userNumber], actionNumber)
                                println("Пользователь добавлен")
                            } else println("Пользователя или статуса с таким номером нет")
                        }

                        4 -> rooms[selectedRoom].users.keys.forEach { print("${it.name} ") }

                        11 -> rooms[selectedRoom].printRoomCard()

                        null -> println(GRAY + "Вы вышли из комнаты$RESET_COLOR")

                        else -> println("Действия с таким номерам нет")

                    }

                } while (actionNumber != null)
                actionNumber = 0
            }

            null -> println(BLUE + "Вы завершили программу")

            else -> println(GRAY + "Номера с таким действием нет$RESET_COLOR")
        }
        println()
    } while (actionNumber != null)


}

class User(val name: String, val avatar: List<String>)

class RoomCard(val name: String, val avatar: List<String>, val users: MutableMap<User, String>) {

    fun getStatuses(): List<String> = status

    fun setUserStatus(userName: String, statusIndex: Int) {
        users.keys.forEach { user ->
            if (user.name == userName) {
                users[user] = status[statusIndex]
                return
            }
        }
        println("Пользователь с таким именем не найден")
    }

    fun addUser(user: User, statusIndex: Int = 0) {
        users[user] = status[statusIndex]
    }

    fun touchOnAvatar(userIndex: Int) {
        val usersKey = users.keys.toList()[userIndex]
        val userCardGUI = usersKey.avatar.toMutableList()
        val indentation = "\t"
        userCardGUI[0] += ("$indentation$RESET_COLOR№${userIndex + 1} ${usersKey.name}")
        userCardGUI[1] += ("$indentation$RESET_COLOR${users[usersKey]}")
        println(userCardGUI.joinToString("\n", postfix = RESET_COLOR))
    }

    fun printRoomCard() {
        println("room: $name")
        val roomCardGUI = mutableListOf<String>()
        val indentation = 1
        val distanceBetweenPictures = "\t\t"

        avatar.forEachIndexed { lineIndex, line ->
            roomCardGUI.add(line)
            users.keys.forEach { user ->
                if (lineIndex >= indentation && lineIndex < user.avatar.size + indentation) {
                    roomCardGUI[lineIndex] += "$distanceBetweenPictures${user.avatar[lineIndex - indentation]}"
                }
            }
        }
        users.values.forEachIndexed { index, status ->
            roomCardGUI[0] += "$RESET_COLOR$distanceBetweenPictures" + "№${index + 1} $status"
                .padEnd((users.keys.toList().first().avatar.size * avatarWidthToLength).toInt(), ' ')
        }
        println(roomCardGUI.joinToString("\n", postfix = RESET_COLOR))
    }
}

fun createRooms(users: List<User>): List<RoomCard> {
    val roomAvatarLength = 8
    val roomNames = listOf("Steel Souls", "Number 5", "twelve-part Kata", "Hunters", "ghosts")

    var numberOfUsers: Int
    var usersShuffled: List<User>
    var usersToStatus: MutableMap<User, String>
    val rooms = mutableListOf<RoomCard>()

    roomNames.forEach { roomName ->
        numberOfUsers = (0 until users.size).random()
        usersShuffled = users.shuffled()
        usersToStatus = mutableMapOf()

        for (i in 0..numberOfUsers) {
            usersToStatus[usersShuffled[i]] = status.random()
        }
        rooms.add(
            RoomCard(
                roomName,
                generateAvatar(roomAvatarLength),
                usersToStatus
            )
        )
    }
    return rooms
}

fun createUsers(): List<User> {
    val userAvatarLength = 5
    val userNames = listOf("ayras", "avelin", "aldor", "alan", "ayvan")
    val users = mutableListOf<User>()

    for (i in 0 until userNames.size) {
        users.add(User(userNames[i], generateAvatar(userAvatarLength)))
    }
    return users
}

fun generateAvatar(avatarLength: Int): List<String> {
    val colors = arrayOf(PURPURE, BLUE, GREEN, ORANGE, RED, TURQUOISE)
    val specialChars = "#=-<>/|)]WDSXZWDSXZ`'^.,\""
    val avatarWidth = (avatarLength * avatarWidthToLength).toInt()
    var lineElements = mutableListOf<String>()
    val avatar = mutableListOf<String>()

    repeat(avatarLength) {
        do {
            lineElements.add("${colors.random()}${specialChars.random()}")
            repeat((1..avatarLength).random()) { lineElements.add(specialChars.random().toString()) }
        } while (lineElements.size < avatarWidth)

        avatar.add(lineElements.joinToString("", limit = avatarWidth, truncated = ""))
        lineElements = mutableListOf()
    }
    return avatar
}

fun printHint() {
    println("0. Показать эту подсказку")
    println("1. Показать список комнат")
    println("2. Выбрать комнату")
    println(GRAY + "Чтобы выйти, впишите все, что душе угодно кроме цифр$RESET_COLOR")
    println("---Действия внутри комнат---$GRAY ввберите комнату для действий внутри$RESET_COLOR")
    println("0. Показать эту подсказку")
    println("1. Зажать аватар")
    println("2. Изменить статус участника")
    println("3. Добавить участника")
    println("4. Вывести список участников")
    println("11. Продублировать карту выбранной комнаты")
    println(GRAY + "Чтобы выйти из действий комнат, напишите тольно не цифры$RESET_COLOR")
}