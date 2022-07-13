package ru.javersingleton.play_life.db.dto

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "project")
data class ProjectDto(
    @PrimaryKey val id: String,
    val title: String?,
    val color: String?
)