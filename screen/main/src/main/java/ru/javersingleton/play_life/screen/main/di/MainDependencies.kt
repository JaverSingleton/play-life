package ru.javersingleton.play_life.screen.main.di

import ru.javersingleton.play_life.db.dao.NoteDao
import ru.javersingleton.play_life.core.di.Dependencies

interface MainDependencies: Dependencies {

    fun noteDao(): NoteDao

}