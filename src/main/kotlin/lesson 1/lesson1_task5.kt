fun main() {

    val flySeconds: Int = 6480

    val hours = flySeconds / 3600
    val remainAfterHours= flySeconds % 3600

    val minutes = remainAfterHours / 60
    val seconds = remainAfterHours % 60

    println("0${hours}:${minutes}:${seconds}0")

}
