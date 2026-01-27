package org.example.lesson_14

open class Message(
    val messageId: Int,
    val messageText: String,
    val messageAuthor: String,
)

class ChildMessage(
    messageId: Int,
    messageText: String,
    val parentMessageId: Int,
    messageAuthor: String
) : Message(messageId, messageText, messageAuthor)


class Chat(
    val messagesList: MutableList<Message> = mutableListOf(),
    var nextMessageId: Int = 1
) {

    fun addMessage(messageAuthor: String, messageText: String) {
        val userId = nextMessageId
        nextMessageId++
        val message = Message(userId, messageText, messageAuthor)
        messagesList.add(message)
    }

    fun addThreadMessage(messageAuthor: String, messageText: String, parentMessageId: Int) {

        val parentExists = messagesList.any { it.messageId == parentMessageId && it !is ChildMessage }
        if (!parentExists) {
            println("Нельзя создать тред под сообщением с id=$parentMessageId")
            return
        }

        val userId = nextMessageId
        nextMessageId++
        val threadMessage = ChildMessage(userId, messageText, parentMessageId, messageAuthor)
        messagesList.add(threadMessage)
    }

    fun printChat() {
        val groupedMessages = messagesList.groupBy { message ->
            when (message) {
                is ChildMessage -> message.parentMessageId
                else -> message.messageId
            }
        }

        groupedMessages
            .toSortedMap()
            .forEach { (_, messagesInGroup) ->
                val parentMessage = messagesInGroup
                    .find { it !is ChildMessage }
                println("${parentMessage?.messageAuthor}: ${parentMessage?.messageText}")

                messagesInGroup
                    .filterIsInstance<ChildMessage>()
                    .forEach { child ->
                        println("\t${child.messageAuthor}: ${child.messageText}")
                    }
            }
    }
}

fun main() {
    val chat1 = Chat()
    chat1.addMessage("Lyle", "Hi")
    chat1.addThreadMessage("Ruri", "Hello", 1)
    chat1.addThreadMessage("Lola", "Good morning", 1)
    chat1.addMessage("Poqa", "How weather")
    chat1.addThreadMessage("Kaja", "Good", 2)
    chat1.printChat()
}