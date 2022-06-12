package ru.javersingleton.play_life.db.dao

import androidx.room.*
import ru.javersingleton.play_life.db.entity.ProjectEntity
import ru.javersingleton.play_life.db.entity.ProjectWithScoresEntity

@Dao
interface ProjectDao {
    @Query("SELECT * FROM project")
    fun getProjects(): List<ProjectEntity>

    @Query("SELECT * FROM project WHERE id = :projectId")
    @Transaction
    fun getProjectWithScores(projectId: Long): ProjectWithScoresEntity

    @Insert
    fun insertProject(project: ProjectEntity)

    @Delete
    fun deleteProject(project: ProjectEntity)
}