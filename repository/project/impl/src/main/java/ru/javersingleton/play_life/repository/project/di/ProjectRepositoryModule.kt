package ru.javersingleton.play_life.repository.project.di

import dagger.Binds
import dagger.Module
import ru.javersingleton.play_life.repository.core.di.IdGeneratorModule
import ru.javersingleton.play_life.repository.project.ProjectRepository
import ru.javersingleton.play_life.repository.project.ProjectRepositoryImpl
import javax.inject.Singleton

@Module(
    includes = [IdGeneratorModule::class]
)
interface ProjectRepositoryModule {

    @Binds
    @Singleton
    fun bindProjectRepository(projectRepositoryImpl: ProjectRepositoryImpl): ProjectRepository

}