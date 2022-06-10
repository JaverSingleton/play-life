package ru.javersingleton.play_life.repository.project

interface ProjectRepository {
    fun getProjects(): List<Project>
}