package com.example.notes.documentation.presentation.notes

import com.example.notes.documentation.domain.model.Note
import com.example.notes.documentation.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderNote: NotesEvent()
}