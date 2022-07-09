package ru.javersingleton.play_life.db.dto

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