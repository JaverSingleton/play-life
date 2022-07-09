package ru.javersingleton.play_life.db.entity

import androidx.room.*

data class ProjectWithScoresEntity(
    @Embedded val project: ProjectDto,
    @Relation(
        parentColumn = "id",
        entityColumn = "projectId"
    )
    val scores: List<ScoreDto>
)