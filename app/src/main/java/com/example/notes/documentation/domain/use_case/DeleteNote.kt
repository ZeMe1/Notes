package com.example.notes.documentation.domain.use_case

import com.example.notes.documentation.domain.model.Note
import com.example.notes.documentation.domain.repository.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

class DeleteNote @Inject constructor (
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}