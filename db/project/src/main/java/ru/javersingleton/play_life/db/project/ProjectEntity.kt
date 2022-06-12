package ru.javersingleton.play_life.db.project

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "project")
data class ProjectEntity(
    @PrimaryKey val id: Int,
    val title: String?,
    val color: String?
)