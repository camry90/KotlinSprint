package org.example.lesson_21

class Player215(val skills: MutableMap<String, Int>) {

    fun gainExperience(skill: String, xp: Int) {
        skills[skill] = skills.getOrDefault(skill, 0) + xp
    }
}

fun main() {

    val player = Player215(mutableMapOf())
    player.gainExperience("Fireball", 80)
    player.gainExperience("Water splash", 100)
    player.gainExperience("Doom", 100)
    println(player.skills.maxCategory())
}

fun Map<String, Int>.maxCategory(): String? {
    return this.maxByOrNull { it.value }?.key
}