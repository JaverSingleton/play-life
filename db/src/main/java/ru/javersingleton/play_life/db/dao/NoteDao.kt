package ru.javersingleton.play_life.db.dao

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import ru.javersingleton.play_life.db.dto.NoteDto

@Dao
interface NoteDao {
    @Query("SELECT * FROM note")
    @Transaction
    fun getNotesWithScores(): Flow<List<NoteDto>>

    @Insert
    fun insertNote(note: NoteDto)

    @Delete
    fun deleteNote(note: NoteDto)
}