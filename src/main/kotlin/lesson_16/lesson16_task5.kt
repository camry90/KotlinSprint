package org.example.lesson_16

class Player(
    val name: String,
    private var hp: Int,
    var power: Int,
) {

    private fun death() {
        if (hp <= 0) {
            power = 0
            hp = 0
        }
    }

    fun takeDamage(inputPower: Int) {
        hp -= inputPower
        death()
        println("Получено $inputPower единиц урона")
    }

    fun healing(inputHeal: Int) {
        if (hp <= 0) {
            println("Мертвых нельзя лечить")
        } else {
            hp += inputHeal
            println("Восстановлено $inputHeal единиц здоровья")
        }
    }

    fun playerStats() {
        println("Имя: $name\nЗдоровья: $hp\nСила удара: $power")
    }

}

fun main() {

    val user1 = Player("Kyle", 50, 20)
    user1.playerStats()
    user1.takeDamage(20)
    user1.playerStats()
    user1.healing(10)
    user1.takeDamage(100)
    user1.playerStats()
    user1.healing(100)
}

