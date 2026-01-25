package org.example.lesson_12

class Weather() {

    var dayTemprature = 5
    var nightTemprature = 0
    var rainfall = 122

    fun printInfo() {
        println(
            "Дневаная температура: ${this.dayTemprature}\n" +
                    "Ночная температура: ${this.nightTemprature}\n" +
                    "Количество осадков: ${this.rainfall}"
        )
    }

}

fun main() {

    val monday = Weather()
    monday.dayTemprature = 8
    monday.nightTemprature = 3
    monday.rainfall = 98
    monday.printInfo()

    val tuesday = Weather()
    tuesday.dayTemprature = 11
    tuesday.nightTemprature = 5
    tuesday.rainfall = 221
    tuesday.printInfo()

}