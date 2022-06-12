package ru.javersingleton.play_life.db.project

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProjectDao {
    @Query("SELECT * FROM project")
    fun getAllProjects(): List<ProjectEntity>

    @Insert
    fun insertProjects(vararg project: ProjectEntity)

    @Delete
    fun deleteProject(project: ProjectEntity)
}