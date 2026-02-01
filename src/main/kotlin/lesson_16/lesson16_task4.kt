package org.example.lesson_16

class Order(
    val orderNumber: Int,
    status: String,
) {

    private var status: String = "начальный статус"

    private fun changeStatus(newStatus: String) {
        status = newStatus
        println("Статус заказа изменён на $status")
    }

    fun sendRequest(newStatus: String) {
        changeStatus(newStatus)
        println("Заявка отправлена")
    }
}


fun main() {

    val order1 = Order(1, "В работе")

    println("Введите новый статус заказа: ")
    order1.sendRequest(readln())

}