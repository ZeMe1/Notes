package com.example.notes.documentation.domain.use_case

import com.example.notes.documentation.domain.model.Note
import com.example.notes.documentation.domain.repository.NoteRepository
import javax.inject.Inject

class GetNote @Inject constructor(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}