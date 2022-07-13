package ru.javersingleton.play_life.repository.project

interface ProjectRepository {
    suspend fun loadProjects(): List<Project>

    suspend fun createProject(project: Project)
}