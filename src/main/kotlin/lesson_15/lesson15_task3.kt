package org.example.lesson_15

abstract class ForumUsers(
    val id: Int,
    val name: String,
) {

    fun sendMessage() {
        println("[$id] $name отправил сообщение")
    }

    fun readMessage() {
        println("Сообщение прочитано by [$id] $name")
    }

}

class Admin(
    id: Int,
    name: String,
) : ForumUsers(id, name) {

    fun deleteMessage(userName: String) {
        println("Сообщение пользователя $userName удалено by [$id] $name")
    }

    fun deleteUser(userName: String) {
        println("Пользователь $userName удалён by [$id] $name")
    }
}

class User(
    id: Int,
    name: String,
) : ForumUsers(id, name)

fun main() {

    val user1 = User(1, "Kyle")
    val user2 = Admin(999, "Moderator2")

    user1.sendMessage()
    user2.readMessage()
    user2.deleteMessage("Kyle")
    user2.deleteUser("Kyle")
}