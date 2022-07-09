package ru.javersingleton.play_life.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note")
data class NoteDto(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val message: String?
)