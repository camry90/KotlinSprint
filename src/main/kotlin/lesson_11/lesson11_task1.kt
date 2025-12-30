package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {

    fun printUserInfo() {
        println(
            "Id: $id\n" +
                    "Login: $login\n" +
                    "Password: $password\n" +
                    "Email: $email\n"
        )
    }
}

fun main() {

    val firstUser = User(1, "Octopus", "oct888", "octopuss8@gmail.com")
    val secondUser = User(2, "Ian4k", "ian123ian", "ian4k123@gmail.com")

    firstUser.printUserInfo()
    secondUser.printUserInfo()
}