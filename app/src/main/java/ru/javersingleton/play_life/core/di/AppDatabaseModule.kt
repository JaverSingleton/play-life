package ru.javersingleton.play_life.core.di

import android.app.Application
import dagger.Module
import dagger.Provides
import ru.javersingleton.play_life.db.di.DatabaseModule
import javax.inject.Singleton

@Module(includes = [DatabaseModule::class])
object AppDatabaseModule {

    @Provides
    @Singleton
    fun provideDatabaseConfig(
        application: Application
    ): DatabaseModule.Config = object : DatabaseModule.Config {
        override val name = "database"
        override val application = application
    }

}