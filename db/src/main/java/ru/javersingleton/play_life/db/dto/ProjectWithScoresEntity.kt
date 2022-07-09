package ru.javersingleton.play_life.db.dto

import androidx.room.*

data class ProjectWithScoresEntity(
    @Embedded val project: ProjectDto,
    @Relation(
        parentColumn = "id",
        entityColumn = "projectId"
    )
    val scores: List<ScoreDto>
)