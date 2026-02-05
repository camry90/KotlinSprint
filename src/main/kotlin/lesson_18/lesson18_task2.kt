package org.example.lesson_18

open class DiceType {

    open val sides: Int = 0

    open fun getDiceNumber() {
        val number = (1..sides).random()
        println("Выпало: $number")
    }
}

class DiceFour : DiceType() {
    override val sides = 4
}

class DiceSix : DiceType() {
    override val sides = 6
}

class DiceEight : DiceType() {
    override val sides = 8
}

fun main() {

    val dice1 = DiceFour()
    val dice2 = DiceSix()
    val dice3 = DiceEight()

    val diceList: List<DiceType> = listOf(dice1, dice2, dice3)
    diceList.forEach { it.getDiceNumber() }
}
