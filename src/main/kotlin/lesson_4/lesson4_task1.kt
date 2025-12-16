package org.example.lesson_4

const val TABLES_IN_RESTAURANT = 13

fun main() {

    val reservedTablesToday = 13
    val reservedTablesTommorow = 9

    val availableTablesToday = reservedTablesToday < TABLES_IN_RESTAURANT

    val availableTablesTommorow = reservedTablesTommorow < TABLES_IN_RESTAURANT

    println("Доступность столиков на сегодня: $availableTablesToday \n" +
            "Доступность столиков на завтра: $availableTablesTommorow ")

}