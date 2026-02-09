package org.example.lesson_22

class RegularBook2(val title: String, val author: String)

data class DataBook2(val title: String, val author: String)

fun main() {

    val book1 = RegularBook2("Julia", "Silva")
    val book2 = DataBook2("Julia", "Silva")

    // класс выводит ссылку на объект
    println(book1)

    // дата класс данные
    println(book2)
}