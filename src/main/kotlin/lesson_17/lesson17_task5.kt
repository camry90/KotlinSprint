package org.example.lesson_17

class User0(
    login: String,
    password: String,
) {
    var password: String = password
        get() {
            var symbols: String = ""
            for (i in 1..field.length) {
                symbols += '*'
            }
            return symbols
        }
        set(value) {
            if (field.isNotEmpty()) {
                println("Вы не можете изменить пароль")
                return
            }
            field = value
        }

    var login: String = login
        set(value) {
            field = value
            println("Вы успешно изменили логин")
        }
}

fun main() {
    val user1 = User0("lll", "ykio1")
    user1.password = "ykio111111"
    user1.login = "123"
    println(user1.password)

}