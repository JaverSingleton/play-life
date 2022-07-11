package ru.javersingleton.play_life.db.dao

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import ru.javersingleton.play_life.db.dto.ProjectDto

@Dao
interface ProjectDao {
    @Query("SELECT * FROM project")
    fun getProjects(): Flow<List<ProjectDto>>

//    @Query("SELECT * FROM project WHERE id = :projectId")
//    @Transaction
//    fun getProjectWithScores(projectId: Long): ProjectWithScoresEntity

    @Insert
    fun insertProject(project: ProjectDto)

    @Delete
    fun deleteProject(project: ProjectDto)
}