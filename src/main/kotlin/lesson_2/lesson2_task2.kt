package org.example.lesson_2

fun main() {
    val workers = 50
    val workerSalary = 30000

    val interns = 30
    val internSalary = 20000

    val workersSalaryCost = workers * workerSalary
    val totalSalaryCost = workersSalaryCost + interns * internSalary
    val averageSalary = totalSalaryCost / (workers + interns)

    println(workerSalary)
    println(totalSalaryCost)
    println(averageSalary)

}