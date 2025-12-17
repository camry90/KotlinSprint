package org.example.lesson_4

fun main() {

    val trainingDay = 5
    val isArmsAndAbsDay = trainingDay % 2 == 0
    val isLegsAndBackDay = !isArmsAndAbsDay

    println("""
        ${"Упражнение для рук:".padEnd(22)}$isArmsAndAbsDay
        ${"Упражнение для ног:".padEnd(22)}$isLegsAndBackDay
        ${"Упражнение для спины:".padEnd(22)}$isLegsAndBackDay
        ${"Упражнение для пресса:".padEnd(22)}$isArmsAndAbsDay
    """.trimIndent())

}