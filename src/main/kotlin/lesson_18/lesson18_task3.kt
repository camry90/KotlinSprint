package org.example.lesson_18

open class Tamagotchi {
    open fun eat() {
        println("")
    }

    open fun sleep() {
        println("")
    }
}

class Fox(val name: String) : Tamagotchi() {

    override fun eat() {
        println("[$name] -> [кушает ягоды]")
    }


    override fun sleep() {
        println("[$name] -> [спит]")
    }

}

class Dog(val name: String) : Tamagotchi() {

    override fun eat() {
        println("[$name] -> [грызёт кости]")
    }


    override fun sleep() {
        println("[$name] -> [спит]")
    }
}

class Cat(val name: String) : Tamagotchi() {

    override fun eat() {
        println("[$name] -> [кушает рыбку]")
    }


    override fun sleep() {
        println("[$name] -> [спит]")
    }
}

fun main() {

    val fox = Fox("Лисица")
    val dog = Dog("Шарик")
    val cat = Cat("Барсик")

    val tamagotchiList: List<Tamagotchi> = listOf(fox, dog, cat)
    tamagotchiList.forEach { it.eat() }
}