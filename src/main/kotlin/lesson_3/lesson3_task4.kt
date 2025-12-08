package org.example.lesson_3

fun main() {

    var moveFrom = "E2"
    var moveTo = "E4"
    var moveNumber = 1
    val chessBlackMoveStr = "$moveFrom-$moveTo;$moveNumber"

    println(chessBlackMoveStr)

    moveFrom = "D2"
    moveTo = "D3"
    moveNumber = 2

    val chessWhiteMoveStr = "$moveFrom-$moveTo;$moveNumber"

    println(chessWhiteMoveStr)

}