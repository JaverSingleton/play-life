package ru.javersingleton.play_life.core.di

import dagger.Module
import ru.javersingleton.play_life.core.coroutines.di.DispatchersModule

@Module(
    includes = [
        AppDatabaseModule::class,
        AppRepositoryModule::class,
        DispatchersModule::class
    ]
)
object AppModule