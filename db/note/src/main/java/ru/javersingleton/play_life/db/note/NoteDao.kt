package ru.javersingleton.play_life.db.note

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {
    @Query("SELECT * FROM note")
    fun getAllNotes(): List<NoteEntity>

    @Insert
    fun insertNotes(vararg note: NoteEntity)

    @Delete
    fun deleteNote(note: NoteEntity)
}