package com.example.criminalintent

import android.text.format.DateFormat
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
import androidx.lifecycle.Observer

@Entity
data class Crime(@PrimaryKey val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isSolved: Boolean = false,
//    var type: String = "")
)

