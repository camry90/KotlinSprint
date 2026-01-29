package org.example.lesson_16

class Order(
    val orderNumber: Int,
    var status: String
) {

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

    val order1 = Order(1, "Not ready")

    println("Введите новый статус заказа: ")
    order1.sendRequest(readln())

}