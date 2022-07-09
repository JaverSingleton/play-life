package ru.javersingleton.play_life.db.dao

import androidx.room.Dao
import androidx.room.Insert
import ru.javersingleton.play_life.db.dto.ScoreDto

@Dao
interface ScoreDao {
//    @Query("SELECT * FROM score WHERE projectId = :projectId")
//    fun getProjectScores(projectId: Long): List<ScoreEntity>

    @Insert
    fun insertScores(vararg score: ScoreDto)

//    @Delete
//    fun deleteScores(vararg score: ScoreEntity)
}