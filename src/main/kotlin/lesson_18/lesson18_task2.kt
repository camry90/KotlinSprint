package org.example.lesson_18

open class DiceType {

    open fun getDiceNumber() = ""
}

class DiceFour : DiceType() {

    override fun getDiceNumber() : String {
        val number = (1..4).random()
        return "Выпало: $number"
    }

}

class DiceSix : DiceType() {

    override fun getDiceNumber() : String {
        val number = (1..6).random()
        return "Выпало: $number"
    }
}

class DiceEight : DiceType() {

    override fun getDiceNumber() : String {
        val number = (1..8).random()
        return "Выпало: $number"
    }
}

fun main() {

    val dice1 = DiceFour()
    val dice2 = DiceSix()
    val dice3 = DiceEight()

    val diceList: List<DiceType> = listOf(dice1, dice2, dice3)
    diceList.forEach { println(it.getDiceNumber()) }
}
