package org.example.lesson_8

fun main() {

    val receiptBolognese = arrayOf(
        "паста", "говядина", "морковь",
        "томаты", "базилик", "перец", "вода"
    )

    for (i in receiptBolognese) {
        println(i)
    }

    println("\nКакой ингредиент вы хотите заменить: ")
    val userDeletePick = readln()

    val index = receiptBolognese.indexOf(userDeletePick)

    if (index != -1) {
        println("Какой ингредиент вы бы хотели добавить: ")
        val userAddPick = readln()
        receiptBolognese[index] = userAddPick
        println("Готов! Вы сохраниои следующий список:\n ")
        for (i in receiptBolognese) {
            println(i)
        }
    } else {
        println("Такого ингредиента нет в списке")
    }

}