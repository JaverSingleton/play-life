package ru.javersingleton.play_life.db.score

import androidx.room.Embedded
import androidx.room.Relation
import ru.javersingleton.play_life.db.project.ProjectEntity

// TODO Move to separate module or make single module for entities
data class ScoreWithProjectEntity(
    @Embedded val note: ScoreEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "projectId"
    )
    val project: ProjectEntity
)