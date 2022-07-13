package ru.javersingleton.play_life.core.di

import dagger.Module
import ru.javersingleton.play_life.repository.project.di.ProjectRepositoryModule


@Module(
    includes = [
        ProjectRepositoryModule::class
    ]
)
object AppRepositoryModule