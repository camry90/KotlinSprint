package org.example.lesson_22

class ReguralBook(val title: String, val author: String) {

}

data class DataBook(val title: String, val author: String) {

}

fun main() {


    val book1 = DataBook("Michael Jackson", "Michael Jackson")
    val book2 = DataBook("Michael Jackson", "Michael Jackson")

    val book3 = ReguralBook("Chernobyl", "Sasha Beliy")
    val book4 = ReguralBook("Chernobyl", "Sasha Beliy")

    // дата класс сравнивает данные
    println(book1 == book2)

    // обычный класс ссылки
    println(book3 == book4)



}
