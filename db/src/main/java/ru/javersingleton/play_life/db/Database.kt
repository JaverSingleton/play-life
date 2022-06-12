package ru.javersingleton.play_life.db

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.javersingleton.play_life.db.dao.NoteDao
import ru.javersingleton.play_life.db.dao.ProjectDao
import ru.javersingleton.play_life.db.dao.ScoreDao

@Database(
    entities = [
        NoteDao::class,
        ProjectDao::class,
        ScoreDao::class,
    ],
    version = 1
)
abstract class Database : RoomDatabase() {
    abstract fun noteDao(): NoteDao
    abstract fun projectDao(): ProjectDao
    abstract fun scoreDao(): ScoreDao
}