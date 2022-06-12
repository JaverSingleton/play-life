package ru.javersingleton.play_life.db.dao

import androidx.room.*
import ru.javersingleton.play_life.db.entity.NoteEntity
import ru.javersingleton.play_life.db.entity.NoteWithScoresEntity

@Dao
interface NoteDao {
    @Query("SELECT * FROM note")
    @Transaction
    fun getNotesWithScores(): List<NoteWithScoresEntity>

    @Insert
    fun insertNote(note: NoteEntity)

    @Delete
    fun deleteNote(note: NoteEntity)
}