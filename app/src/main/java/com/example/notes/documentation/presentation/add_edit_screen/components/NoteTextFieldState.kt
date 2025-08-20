package com.example.notes.documentation.presentation.add_edit_screen.components

import androidx.compose.runtime.MutableState

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
