package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val timeMinutesWay = 457
    val timeMinutesLeave = 39
    val timeHourLeave = 9

    val totalMinuteLeave = timeMinutesLeave + timeHourLeave * MINUTES_IN_HOUR
    val totalMinuteArrival = totalMinuteLeave + timeMinutesWay

    val timeHoursArrival = totalMinuteArrival / MINUTES_IN_HOUR
    val timeMinutesArrival = totalMinuteArrival % MINUTES_IN_HOUR

    val hoursStr = timeHoursArrival.toString().padStart(2, '0')
    val minutesStr = timeMinutesArrival.toString().padStart(2, '0')

    println("$hoursStr:$minutesStr")

}