package org.example.lesson_20

fun main() {

    val elementList = listOf("Кнопка 1", "Кнопка 2", "Кнопка 3", "Кнопка 4", "Кнопка 5")

    val clickedElements = elementList.map { element ->
        { println("Нажат элемент $element") }
    }

    clickedElements.forEachIndexed { index, element ->
        if (index % 2 == 0) {
            element()
        }
    }

}