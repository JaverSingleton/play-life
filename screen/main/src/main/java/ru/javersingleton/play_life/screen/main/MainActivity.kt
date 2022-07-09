package ru.javersingleton.play_life.screen.main

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ru.javersingleton.play_life.db.dao.NoteDao
import ru.javersingleton.play_life.db.entity.NoteDto
import ru.javersingleton.play_life.di.findDependencies
import ru.javersingleton.play_life.screen.main.di.DaggerMainComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var noteDao: NoteDao

    private lateinit var titleView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMainComponent.builder()
            .withDependencies(findDependencies())
            .build()
            .inject(this)

        titleView = findViewById(R.id.title)

        noteDao.insertNote(NoteDto(message = "Test"))
        val notes = noteDao
            .getNotesWithScores()
        titleView.text = notes.map { it.message }.joinToString(", ")
    }
}