package ru.javersingleton.play_life.db.score

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ScoreDao {
    @Query("SELECT * FROM score")
    fun getAllScores(): List<ScoreEntity>

    @Insert
    fun insertScores(vararg score: ScoreEntity)

    @Delete
    fun deleteScore(score: ScoreEntity)
}