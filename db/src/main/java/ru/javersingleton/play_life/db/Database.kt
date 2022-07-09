package ru.javersingleton.play_life.db

import ru.javersingleton.play_life.db.dao.NoteDao
import ru.javersingleton.play_life.db.dao.ProjectDao
import ru.javersingleton.play_life.db.dao.ScoreDao


interface Database {
    fun noteDao(): NoteDao
    fun projectDao(): ProjectDao
    fun scoreDao(): ScoreDao
}