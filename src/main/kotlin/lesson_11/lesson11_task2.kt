package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null,
) {

    fun printUserInfo2() {
        println(
            "Id: $id\n" +
                    "Login: $login\n" +
                    "Password: $password\n" +
                    "Email: $email\n" +
                    "Bio: $bio"
        )
    }

    fun updateBio() {
        println("Введите описание: ")
        bio = readln()
    }

    fun resetPassword() {
        println("Введите текущий пароль: ")
        val currentPassword = readln()
        if (currentPassword == password) {
            println("Введите новый пароль: ")
            password = readln()
            println("Пароль был успешно изменён!\n")
        } else {
            println("Неправильный пароль!")
        }
    }

}

fun main() {

    val firstUser = User2(1, "Octopus", "oct888", "octopus88@gmail.com")
    firstUser.updateBio()
    firstUser.resetPassword()
    firstUser.printUserInfo2()

}
