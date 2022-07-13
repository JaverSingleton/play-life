package ru.javersingleton.play_life.db.dto

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "score")
data class ScoreDto(
    @PrimaryKey val id: String,
    val value: Float,
    val noteId: Int,
    val projectId: Int,
)