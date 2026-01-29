package org.example.lesson_15

interface Finder {
    fun findProduct()
}

abstract class Product(
    val name: String,
    val count: Int,
    val price: Int,
)

class Instrument(
    name: String,
    count: Int,
    price: Int,
) : Product(name, count, price), Finder {

    override fun findProduct() {
        println("Выполняется поиск")
    }

}

class InstrumentComponents(
    name: String,
    count: Int,
    price: Int,
) : Product(name, count, price)

fun main() {

    val component = InstrumentComponents("Комплект струн для гитары", 5, 400)
    val instrument = Instrument("Гитара", 8, 21000)
    instrument.findProduct()
}