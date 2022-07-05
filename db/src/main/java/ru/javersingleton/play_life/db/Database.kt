package ru.javersingleton.play_life.db

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.javersingleton.play_life.db.dao.NoteDao
import ru.javersingleton.play_life.db.dao.ProjectDao
import ru.javersingleton.play_life.db.dao.ScoreDao
import ru.javersingleton.play_life.db.entity.NoteEntity
import ru.javersingleton.play_life.db.entity.ProjectEntity
import ru.javersingleton.play_life.db.entity.ScoreEntity

@Database(
    entities = [
        NoteEntity::class,
        ProjectEntity::class,
        ScoreEntity::class,
    ],
    version = 2
)
abstract class Database : RoomDatabase() {
    abstract fun noteDao(): NoteDao
    abstract fun projectDao(): ProjectDao
    abstract fun scoreDao(): ScoreDao
}