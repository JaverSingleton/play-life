package ru.javersingleton.play_life.screen.main

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.runtime.collectAsState
import kotlinx.coroutines.flow.map
import ru.javersingleton.play_life.db.dao.NoteDao
import ru.javersingleton.play_life.core.di.findDependencies
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
            val text = noteDao
                .getNotesWithScores()
                .map { it.map { it.message }.joinToString(", ") }
                .collectAsState(initial = "")
            Text(
                text = text.value
            )
        }
    }
}