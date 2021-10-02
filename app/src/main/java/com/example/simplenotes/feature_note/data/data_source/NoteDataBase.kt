package com.example.simplenotes.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.simplenotes.feature_note.domain.model.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDataBase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val NOTES_DATA_BASE_NAME = "notes_data_base_name"
    }

}