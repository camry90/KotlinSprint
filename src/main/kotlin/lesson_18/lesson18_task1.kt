package org.example.lesson_18

class OrderInfo(
    val orderNumber: Int,
) {

    fun printOrder(product: String) {
        println("Заказан товар: $product")
    }

    fun printOrder(product: List<String>) {
        println("Заказаны следующие товары: ${product.joinToString(", ")}")
    }
}

fun main() {

    val order1 = OrderInfo(1234)
    order1.printOrder("Малекула")
    val order2 = OrderInfo(4123)
    order2.printOrder(listOf("Арбуз", "Картофель", "Молоко"))
}