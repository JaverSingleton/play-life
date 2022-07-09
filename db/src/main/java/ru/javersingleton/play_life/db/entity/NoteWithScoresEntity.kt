package ru.javersingleton.play_life.db.entity

import androidx.room.*

data class NoteWithScoresEntity(
    @Embedded val note: NoteDto,
    @Relation(
        parentColumn = "id",
        entityColumn = "noteId"
    )
    val scores: List<ScoreWithProjectEntity>
)