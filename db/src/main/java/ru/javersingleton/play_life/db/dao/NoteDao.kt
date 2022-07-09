package ru.javersingleton.play_life.db.dao

import androidx.room.*
import ru.javersingleton.play_life.db.entity.NoteDto

@Dao
interface NoteDao {
    @Query("SELECT * FROM note")
    @Transaction
    fun getNotesWithScores(): List<NoteDto>

    @Insert
    fun insertNote(note: NoteDto)

    @Delete
    fun deleteNote(note: NoteDto)
}