package ru.javersingleton.play_life.db.dto

import androidx.room.*

data class NoteWithScoresEntity(
    @Embedded val note: NoteDto,
    @Relation(
        parentColumn = "id",
        entityColumn = "noteId"
    )
    val scores: List<ScoreWithProjectEntity>
)