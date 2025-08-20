package com.example.notes.documentation.domain.use_case

import com.example.notes.documentation.domain.model.InvalidNoteException
import com.example.notes.documentation.domain.model.Note
import com.example.notes.documentation.domain.repository.NoteRepository
import javax.inject.Inject
import kotlin.jvm.Throws

class AddNote @Inject constructor(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("Title can't be empty")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("Content can't be empty")
        }
        repository.insertNote(note)
    }
}