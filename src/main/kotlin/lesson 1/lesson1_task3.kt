fun main() {

    val year = "1961"
    val hour = "09"
    val minute = "07"

    println(year)


    println(hour)
    println(minute)

    val newHour = 10
    val newMinute = 55

    val newHourStr = newHour.toString().padStart(2, '0')
    val newMinuteStr = newMinute.toString().padStart(2, '0')

    println("$newHourStr:$newMinuteStr")

}
