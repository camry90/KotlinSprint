fun main() {

    val year = 1961
    val hour = 9
    val minute = 7

    println(year)

    val hourStr = hour.toString().padStart(2, '0')
    val minuteStr = minute.toString().padStart(2, '0')

    println(hourStr)
    println(minuteStr)

    val newHour = 10
    val newMinute = 55

    val newHourStr = newHour.toString().padStart(2, '0')
    val newMinuteStr = newMinute.toString().padStart(2, '0')

    println("$newHourStr:$newMinuteStr")

}
