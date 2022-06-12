package ru.javersingleton.play_life.db.score

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "score")
data class ScoreEntity(
    @PrimaryKey val id: Int,
    val value: Float?,
    val noteId: Int,
    val projectId: Int,
)