const val SECONDS_IN_MINUTE = 60
const val SECONDS_IN_HOUR = 3600

fun main() {

    val flySeconds = 6480

    val hours = flySeconds / SECONDS_IN_HOUR
    val remainAfterHours= flySeconds % SECONDS_IN_HOUR

    val minutes = remainAfterHours / SECONDS_IN_MINUTE
    val seconds = remainAfterHours % SECONDS_IN_MINUTE

    println("0${hours}:${minutes}:${seconds}0")

}
