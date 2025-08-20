package com.example.notes.documentation.presentation.notes.components

import com.example.notes.documentation.domain.model.Note
import com.example.notes.documentation.domain.util.NoteOrder
import com.example.notes.documentation.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
