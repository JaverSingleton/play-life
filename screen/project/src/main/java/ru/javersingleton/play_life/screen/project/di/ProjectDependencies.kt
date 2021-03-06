package ru.javersingleton.play_life.screen.project.di

import ru.javersingleton.play_life.core.di.Dependencies
import ru.javersingleton.play_life.repository.project.ProjectRepository

interface ProjectDependencies : Dependencies {

    fun projectRepository(): ProjectRepository

}