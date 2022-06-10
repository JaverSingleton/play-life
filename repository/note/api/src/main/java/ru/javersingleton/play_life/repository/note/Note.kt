package ru.javersingleton.play_life.repository.note

data class Note(
    val id: String? = null,
    val message: String = "",
    val scores: List<Score> = listOf()
)