package com.example.simplenotes.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.simplenotes.ui.theme.LightBlue
import com.example.simplenotes.ui.theme.LightOrange
import com.example.simplenotes.ui.theme.Pink

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object {
        val noteColors = listOf(LightBlue, LightOrange, Pink)
    }
}

