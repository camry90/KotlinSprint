package org.example.lesson_20

class Player203(val isHasKey: Boolean)

fun main() {

    val openDoor: (Player203) -> String = { player ->
        if (player.isHasKey) {
            "Игрок открыл дверь"
        } else {
            "Дверь заперта"
        }
    }

    val player = Player203(true)
    println(openDoor(player))
    val player2 = Player203(false)
    println(openDoor(player2))
}