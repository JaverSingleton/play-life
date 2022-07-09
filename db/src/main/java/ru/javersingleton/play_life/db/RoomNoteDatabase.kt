package ru.javersingleton.play_life.db

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.javersingleton.play_life.db.dao.NoteDao
import ru.javersingleton.play_life.db.dao.ProjectDao
import ru.javersingleton.play_life.db.dao.ScoreDao
import ru.javersingleton.play_life.db.di.DaggerDatabaseComponent
import ru.javersingleton.play_life.db.di.DatabaseComponent
import ru.javersingleton.play_life.db.entity.NoteDto
import ru.javersingleton.play_life.db.entity.ProjectDto
import ru.javersingleton.play_life.db.entity.ScoreDto

@Database(
    entities = [
        NoteDto::class,
        ProjectDto::class,
        ScoreDto::class,
    ],
    version = 2
)
abstract class RoomNoteDatabase : RoomDatabase(), NoteDatabase {
    class Builder : DatabaseComponent.Builder by DaggerDatabaseComponent.builder()
}



interface NoteDatabase {
    fun noteDao(): NoteDao
    fun projectDao(): ProjectDao
    fun scoreDao(): ScoreDao
}