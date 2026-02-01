package org.example.lesson_17

class Folder(
    name: String,
    countFiles: Int,
    val isSecret: Boolean,
) {
    var name: String = name
        get() {
            if (isSecret == true) {
                return "скрытая папка"
            }
            return field

        }

    var countFiles: Int = countFiles
        get() {
            if (isSecret == true) {
                return 0
            }
            return field
        }
}

fun main() {

    val folder1 = Folder("Games", 12, true)
    println(folder1.name)
    println(folder1.countFiles)
}