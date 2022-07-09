package ru.javersingleton.play_life.db.entity

import androidx.room.Embedded
import androidx.room.Relation

data class ScoreWithProjectEntity(
    @Embedded val note: ScoreDto,
    @Relation(
        parentColumn = "id",
        entityColumn = "projectId"
    )
    val project: ProjectDto
)