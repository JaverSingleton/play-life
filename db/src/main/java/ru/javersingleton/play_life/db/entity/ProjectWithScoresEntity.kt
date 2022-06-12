package ru.javersingleton.play_life.db.entity

import androidx.room.*

data class ProjectWithScoresEntity(
    @Embedded val project: ProjectEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "projectId"
    )
    val scores: List<ScoreEntity>
)