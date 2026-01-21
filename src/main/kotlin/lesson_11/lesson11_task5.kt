package org.example.lesson_11

class ForumMember(
    val userId: Int,
    val userName: String,
)

class MessageForum(
    val authorId: Int,
    val message: String,
)

class Forum {
    private val usersList = mutableListOf<ForumMember>()
    private val messagesList = mutableListOf<MessageForum>()
    private var nextUserId = 1

    fun createNewUser(userName: String): ForumMember {
        val userId = nextUserId
        nextUserId++

        val newUser = ForumMember(userId, userName)
        usersList.add(newUser)
        return newUser
    }

    fun createNewMessage(authorId: Int, message: String): MessageForum? {
        val authorCheck = usersList.find { it.userId == authorId }

        if (authorCheck == null) {
            println("Пользователь не найден")
            return null
        }
        val newMessage = MessageForum(authorId, message)
        messagesList.add(newMessage)
        return newMessage
    }

    fun printThread() {
        for (message in messagesList) {
            val author = usersList.find { it.userId == message.authorId }
            println("${author?.userName}: ${message.message}")
        }
    }
}

fun main() {
    val forum = Forum()
    forum.createNewUser("Лимночик1337")
    forum.createNewUser("Модератор")
    forum.createNewMessage(1, "Это новый форум?")
    forum.createNewMessage(2, "Да, это новый форум.")
    forum.createNewMessage(1, "И о чём он будет?")
    forum.createNewMessage(2, "О чём только хочешь.")
    forum.printThread()
}