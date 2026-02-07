package org.example.lesson_20

fun main() {

    val greetingString: (String) -> Unit = { username: String ->
        println("С наступающим Новым Годом, $username!")
    }

    greetingString("kamgi")

}