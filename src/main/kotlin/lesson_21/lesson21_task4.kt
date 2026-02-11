package org.example.lesson_21

import java.io.File

fun main() {

    val file = File("lesson21-4.txt")
    file.writeInStartFile("Start")

}

fun File.writeInStartFile(string: String) {

    val stringList: MutableList<String> = this.readLines().toMutableList()
    println(stringList)
    val lowerString = string.lowercase()
    stringList.addFirst(lowerString)
    writeText(stringList.joinToString(separator = " "))
}