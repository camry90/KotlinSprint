package org.example.lesson_8

fun main() {

    val countAdViews = arrayOf(1245, 5421, 6123, 9611, 4501, 9917, 7610)
    var countWeekViews = 0

    for (i in countAdViews) {
        countWeekViews += i
    }

    println("Всего просмотрова за неделю: $countWeekViews")
}