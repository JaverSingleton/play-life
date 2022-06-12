package ru.javersingleton.play_life.db.note

import androidx.room.*
import ru.javersingleton.play_life.db.score.ScoreEntity

data class NoteWithScoresEntity(
    @Embedded val note: NoteEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "noteId"
    )
    val scores: List<ScoreEntity>
)