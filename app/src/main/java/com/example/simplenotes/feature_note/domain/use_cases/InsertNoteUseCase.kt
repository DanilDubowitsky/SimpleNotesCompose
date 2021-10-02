package com.example.simplenotes.feature_note.domain.use_cases

import com.example.simplenotes.feature_note.domain.model.Note
import com.example.simplenotes.feature_note.domain.repository.NoteRepository

class InsertNoteUseCase(
    private val notesRepository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        notesRepository.insertNote(note)
    }

}