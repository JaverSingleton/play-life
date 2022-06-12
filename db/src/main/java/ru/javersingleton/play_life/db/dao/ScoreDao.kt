package ru.javersingleton.play_life.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import ru.javersingleton.play_life.db.entity.ScoreEntity

@Dao
interface ScoreDao {
    @Query("SELECT * FROM score WHERE projectId = :projectId")
    fun getProjectScores(projectId: Long): List<ScoreEntity>

    @Insert
    fun insertScores(vararg score: ScoreEntity)

    @Delete
    fun deleteScores(vararg score: ScoreEntity)
}