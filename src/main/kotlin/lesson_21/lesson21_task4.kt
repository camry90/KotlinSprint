package org.example.lesson_21

import java.io.File

fun main() {

    val file = File("lesson21-4.txt")
    file.writeInStartFile("Start")
}

fun File.writeInStartFile(string: String) {

    val lowerString = string.lowercase()
    val lines = readLines()
    val newLines = listOf(lowerString) + lines
    writeText(newLines.joinToString(separator = "\n"))

}