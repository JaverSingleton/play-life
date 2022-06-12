package ru.javersingleton.play_life.db.room

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.javersingleton.play_life.db.note.NoteDao

@Database(entities = [NoteDao::class], version = 1)
abstract class RoomDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}