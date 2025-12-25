package org.example.lesson_8

fun main() {

    val receiptBolognese = arrayOf(
        "паста", "говядина", "морковь",
        "томаты", "базилик", "перец", "вода"
    )

    println(receiptBolognese.joinToString(", "))

    println("\nКакой ингредиент вы хотите заменить: ")
    val userDeletePick = readln()

    val index = receiptBolognese.indexOf(userDeletePick)

    if (index != -1) {
        println("Какой ингредиент вы бы хотели добавить: ")
        val userAddPick = readln()
        receiptBolognese[index] = userAddPick
        println("Готово! Вы сохранили следующий список:\n ")
        println(receiptBolognese.joinToString(", "))
    } else {
        println("Такого ингредиента нет в списке")
    }

}