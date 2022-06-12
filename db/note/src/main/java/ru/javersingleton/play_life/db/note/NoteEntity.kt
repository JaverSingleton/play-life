package ru.javersingleton.play_life.db.note

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note")
data class NoteEntity(
    @PrimaryKey val id: Int,
    val message: String?
)