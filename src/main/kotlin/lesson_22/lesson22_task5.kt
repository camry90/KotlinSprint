package org.example.lesson_22

data class GalacticGuide(
    val place: String,
    val placeBio: String,
    val data: String,
    val placeDistance: String,
)

fun main() {

    val starSystem = GalacticGuide(
        "Alpha Centauri",
        "Звёздная система, расположенная в созвездии Центавра",
        "26700 году",
        "4.3 св. лет"
    )

    val (place, placeBio, data, placeDistance) = starSystem

    println("$place, $placeBio, $data, $placeDistance")
}
