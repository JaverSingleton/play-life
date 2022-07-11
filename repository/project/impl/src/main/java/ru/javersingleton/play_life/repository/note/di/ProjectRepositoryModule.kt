package ru.javersingleton.play_life.repository.note.di

import dagger.Binds
import dagger.Module
import ru.javersingleton.play_life.repository.note.ProjectRepositoryImpl
import ru.javersingleton.play_life.repository.project.ProjectRepository
import javax.inject.Singleton

@Module
interface ProjectRepositoryModule {

    @Binds
    @Singleton
    fun bindProjectRepository(projectRepositoryImpl: ProjectRepositoryImpl): ProjectRepository

}