package com.example.criminalintent

import android.text.format.DateFormat
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
@Entity
data class Crime(@PrimaryKey val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: CharSequence = DateFormat.format("EEE, MMMM dd, yyyy - hh:mm", Date()),
    var isSolved: Boolean = false,
    var type: String = "") {

}