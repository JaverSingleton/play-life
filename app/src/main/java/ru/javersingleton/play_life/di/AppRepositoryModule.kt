package ru.javersingleton.play_life.di

import dagger.Module
import ru.javersingleton.play_life.repository.note.di.ProjectRepositoryModule


@Module(
    includes = [
        ProjectRepositoryModule::class
    ]
)
object AppRepositoryModule