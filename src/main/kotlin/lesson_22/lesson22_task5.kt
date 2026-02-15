package org.example.lesson_22

data class GalacticGuide(
    val place: String,
    val placeBio: String,
    val date: String,
    val placeDistance: String,
)

fun main() {

    val starSystem = GalacticGuide(
        "Alpha Centauri",
        "Звёздная система, расположенная в созвездии Центавра",
        "26700 году",
        "4.3 св. лет"
    )

    println(starSystem.component1())
    println(starSystem.component2())
    println(starSystem.component3())
    println(starSystem.component4())
}
