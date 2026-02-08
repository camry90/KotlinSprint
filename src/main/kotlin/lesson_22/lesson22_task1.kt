package org.example.lesson_22

class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)

fun main() {

    val book1 = DataBook("Michael Jackson", "Michael Jackson")
    val book2 = DataBook("Michael Jackson", "Michael Jackson")

    val book3 = RegularBook("Chernobyl", "Sasha Beliy")
    val book4 = RegularBook("Chernobyl", "Sasha Beliy")

    // дата класс сравнивает данные
    println(book1 == book2)

    // обычный класс ссылки
    println(book3 == book4)

}
