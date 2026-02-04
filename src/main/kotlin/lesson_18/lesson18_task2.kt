package org.example.lesson_18

open class DiceType(
    private val sides: Int,
) {

    open fun getDiceNumber() {
        val number = (1..sides).random()
        println("Выпало: $number")
    }
}

class DiceFour : DiceType(4)

class DiceSix : DiceType(6)

class DiceEight : DiceType(8)

fun main() {

    val dice1 = DiceFour()
    val dice2 = DiceSix()
    val dice3 = DiceEight()

    val diceList: List<DiceType> = listOf(dice1, dice2, dice3)
    diceList.forEach { it.getDiceNumber() }
}
