package com.example.simplenotes.di

import android.app.Application
import androidx.room.Room
import com.example.simplenotes.feature_note.data.data_source.NoteDataBase
import com.example.simplenotes.feature_note.data.data_source.NoteDataBase.Companion.NOTES_DATA_BASE_NAME
import com.example.simplenotes.feature_note.data.repository.NoteRepositoryImpl
import com.example.simplenotes.feature_note.domain.repository.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDataBase(app: Application): NoteDataBase {
        return Room.databaseBuilder(app, NoteDataBase::class.java, NOTES_DATA_BASE_NAME).build()
    }

    @Provides
    @Singleton
    fun provideNotesRepository(dataBase: NoteDataBase): NoteRepository {
        return NoteRepositoryImpl(dataBase.noteDao)
    }

}