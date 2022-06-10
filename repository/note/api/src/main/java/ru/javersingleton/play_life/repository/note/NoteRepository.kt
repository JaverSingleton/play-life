package ru.javersingleton.play_life.repository.note

interface NoteRepository {
    fun getNotes(): List<Note>
    fun updateNote(note: Note)
}