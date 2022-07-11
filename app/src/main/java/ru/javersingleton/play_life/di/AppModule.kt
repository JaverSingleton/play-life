package ru.javersingleton.play_life.di

import dagger.Module

@Module(
    includes = [
        AppDatabaseModule::class,
        AppRepositoryModule::class
    ]
)
object AppModule