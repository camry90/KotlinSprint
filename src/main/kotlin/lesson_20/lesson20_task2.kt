package org.example.lesson_20

class Player202(
    val name: String,
    var currentHp: Int,
    val maxHp: Int,
)

fun main() {

    val healingPotionLambda: (Player202) -> Unit = { player: Player202 ->

        when {
            player.currentHp <= 0 -> println("Мертвого нельзя вылечить")
            player.currentHp >= player.maxHp -> println("У вас полное здоровье")
            else -> {
                player.currentHp = player.maxHp
                println("Текущее здоровье: ${player.currentHp} hp")
            }
        }
    }

    val player = Player202("Rori", 80, 110)

    healingPotionLambda(player)
}