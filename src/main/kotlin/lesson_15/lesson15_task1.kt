package org.example.lesson_15

interface Flyable {
    fun fly()
}

interface Swimable {
    fun swim()
}

class CrusianCarp : Swimable {
    override fun swim() {
        println("Карась плавает")
    }
}

class Seagull : Flyable {
    override fun fly() {
        println("Чайка летает")
    }
}

class Duck : Flyable, Swimable {
    override fun fly() {
        println("Утка летает")
    }

    override fun swim() {
        println("Утка плавает")
    }
}

fun main() {

    val fish1 = CrusianCarp()
    fish1.swim()

    val bird1 = Seagull()
    bird1.fly()

    val bird2 = Duck()
    bird2.fly()
    bird2.swim()

}
