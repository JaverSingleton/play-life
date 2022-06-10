package ru.javersingleton.play_life.repository.note

import ru.javersingleton.play_life.repository.project.Project

data class Score(
    val value: Float,
    val project: Project
)