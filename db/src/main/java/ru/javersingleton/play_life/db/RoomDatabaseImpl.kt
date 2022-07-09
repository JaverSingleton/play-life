package ru.javersingleton.play_life.db

import androidx.room.RoomDatabase
import ru.javersingleton.play_life.db.di.DaggerDatabaseComponent
import ru.javersingleton.play_life.db.di.DatabaseComponent
import ru.javersingleton.play_life.db.dto.NoteDto
import ru.javersingleton.play_life.db.dto.ProjectDto
import ru.javersingleton.play_life.db.dto.ScoreDto
import androidx.room.Database as DatabaseAnnotation

@DatabaseAnnotation(
    entities = [
        NoteDto::class,
        ProjectDto::class,
        ScoreDto::class,
    ],
    version = 2
)
abstract class RoomDatabaseImpl : RoomDatabase(), Database {
    class Builder : DatabaseComponent.Builder by DaggerDatabaseComponent.builder()
}