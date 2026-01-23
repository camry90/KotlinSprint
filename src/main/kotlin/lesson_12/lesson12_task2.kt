package org.example.lesson_12

class Weather1(
    var dayTemprature: Int,
    var nightTemprature: Int,
    var rainfall: Int,
) {

    fun printInfo() {
        println(
            "Дневаная температура: ${this.dayTemprature}\n" +
                    "Ночная температура: ${this.nightTemprature}\n" +
                    "Количество осадков: ${this.rainfall}"
        )
    }

}

fun main() {

    val friday = Weather1(12, 9, 221)
    friday.printInfo()
}