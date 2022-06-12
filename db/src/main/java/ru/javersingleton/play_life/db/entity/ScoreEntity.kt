package ru.javersingleton.play_life.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "score")
data class ScoreEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val value: Float,
    val noteId: Int,
    val projectId: Int,
)