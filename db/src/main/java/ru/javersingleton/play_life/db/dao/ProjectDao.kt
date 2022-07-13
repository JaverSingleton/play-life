package ru.javersingleton.play_life.db.dao

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import ru.javersingleton.play_life.db.dto.ProjectDto

@Dao
interface ProjectDao {
    @Query("SELECT * FROM project")
    suspend fun getProjects(): List<ProjectDto>

    @Insert
    suspend fun insertProject(project: ProjectDto)

    @Delete
    fun deleteProject(project: ProjectDto)
}