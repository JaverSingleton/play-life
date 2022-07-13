package ru.javersingleton.play_life.db.dto

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note")
data class NoteDto(
    @PrimaryKey val id: String,
    val message: String?
)