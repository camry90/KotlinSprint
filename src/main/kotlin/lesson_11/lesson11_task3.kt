package org.example.lesson_11

class Participant(
    val nickname: String,
    val image: Int,
    var status: String,
)

class Room(
    val coverRoom: Int,
    val nameRoom: String,
    val participants: MutableList<Participant>,
) {

    fun addParticipant(participant: Participant) {
        participants.add(participant)
    }

    fun updateStatus(nickname: String, newStatus: String) {
        val participant = participants.find { it.nickname == nickname }
        participant?.status = newStatus
    }
}

fun main() {

    val participant1 = Participant("Люк199", 1, "разговаривает")
    val participant2 = Participant("Ларл999", 2, "микрофон выключен")
    val participant3 = Participant("РазДваТри123", 3, "пользователь заглушен")

    val room1 = Room(
        129,
        "Говорилка",
        mutableListOf(participant1, participant2)
    )

    room1.addParticipant(participant3)
    room1.updateStatus("Ларл999", "разговаривает")

}


