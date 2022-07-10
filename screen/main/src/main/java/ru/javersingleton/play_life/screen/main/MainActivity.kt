package ru.javersingleton.play_life.screen.main

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.runtime.remember
import ru.javersingleton.play_life.db.dao.NoteDao
import ru.javersingleton.play_life.db.dto.NoteDto
import ru.javersingleton.play_life.di.findDependencies
import ru.javersingleton.play_life.screen.main.di.DaggerMainComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var noteDao: NoteDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerMainComponent.builder()
            .withDependencies(findDependencies())
            .build()
            .inject(this)
        setContent {
            val text: String = remember {
                noteDao.insertNote(NoteDto(message = "Test"))
                val notes = noteDao
                    .getNotesWithScores()
                notes.map { it.message }.joinToString(", ")
            }
            Text(
                text = text
            )
        }
    }
}