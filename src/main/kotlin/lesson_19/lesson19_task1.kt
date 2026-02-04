package org.example.lesson_19

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {

    val fishesList = buildList {
        for (i in Fish.entries) {
            add(i)
        }
    }

    println("Список рыб: $fishesList")
}