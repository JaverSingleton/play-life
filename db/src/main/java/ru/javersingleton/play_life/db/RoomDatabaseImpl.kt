package ru.javersingleton.play_life.db

import androidx.room.RoomDatabase
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
    version = 3
)
abstract class RoomDatabaseImpl : RoomDatabase(), Database