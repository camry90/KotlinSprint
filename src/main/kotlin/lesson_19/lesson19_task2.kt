package org.example.lesson_19

enum class Category0 {

    CLOTHES {
        override fun getCategory(): String {
            return "Одежда"
        }
    },
    OFFICE_SUPPLIES {
        override fun getCategory(): String {
            return "Канцелярские товары"
        }
    },
    OTHER {
        override fun getCategory(): String {
            return "Разное"
        }
    };

    abstract fun getCategory(): String
}

class Product192(
    val name: String,
    val id: Int,
    val category: Category0,
) {

    fun printInfo() {
        println("Айди товара: $id\nИмя товара: $name\nКатегория товара: ${category.getCategory()}\n")
    }
}

fun main() {

    val product1 = Product192("Худи", 1, Category0.CLOTHES)
    val product2 = Product192("Карандаш", 2, Category0.OFFICE_SUPPLIES)
    val product3 = Product192("Лампочка", 3, Category0.OTHER)

    product1.printInfo()
    product2.printInfo()
    product3.printInfo()
}