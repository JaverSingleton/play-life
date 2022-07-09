package ru.javersingleton.play_life.db.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.Reusable
import ru.javersingleton.play_life.db.NoteDatabase
import ru.javersingleton.play_life.db.RoomNoteDatabase
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
    ): NoteDatabase =
        Room.databaseBuilder(
            applicationContext,
            RoomNoteDatabase::class.java,
            name
        ).allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()

    @Provides
    @Reusable
    fun provideNoteDao(db: NoteDatabase): NoteDao = db.noteDao()

    @Provides
    @Reusable
    fun provideProjectDao(db: NoteDatabase): ProjectDao = db.projectDao()

    @Provides
    @Reusable
    fun provideScoreDao(db: NoteDatabase): ScoreDao = db.scoreDao()

}