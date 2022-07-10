package ru.javersingleton.play_life.db.dto

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "project")
data class ProjectDto(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String?,
    val color: String?
)