package ru.javersingleton.play_life.db.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.Reusable
import ru.javersingleton.play_life.db.Database
import ru.javersingleton.play_life.db.RoomDatabaseImpl
import ru.javersingleton.play_life.db.dao.NoteDao
import ru.javersingleton.play_life.db.dao.ProjectDao
import ru.javersingleton.play_life.db.dao.ScoreDao

@Module
object DatabaseModule {

    @Provides
    @Reusable
    fun provideDatabase(
        name: String,
        applicationContext: Context
    ): Database =
        Room.databaseBuilder(
            applicationContext,
            RoomDatabaseImpl::class.java,
            name
        ).allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()

    @Provides
    @Reusable
    fun provideNoteDao(db: Database): NoteDao = db.noteDao()

    @Provides
    @Reusable
    fun provideProjectDao(db: Database): ProjectDao = db.projectDao()

    @Provides
    @Reusable
    fun provideScoreDao(db: Database): ScoreDao = db.scoreDao()

}