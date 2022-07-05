package ru.javersingleton.play_life

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import ru.javersingleton.play_life.db.Database
import ru.javersingleton.play_life.db.entity.NoteEntity


class MainActivity : AppCompatActivity() {
    private lateinit var db: Database
    private lateinit var titleView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        titleView = findViewById(R.id.title)
        db = Room.databaseBuilder(
            applicationContext,
            Database::class.java,
            "database"
        ).allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()

        db.noteDao().insertNote(NoteEntity(message = "Test"))
        val notes = db.noteDao()
            .getNotesWithScores()
        titleView.text = notes.map { it.message }.joinToString(", ")
    }
}