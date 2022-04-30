package com.example.criminalintent

import android.content.Context
import androidx.room.Room
import database.CrimeDateBase
import java.lang.IllegalStateException
import java.util.*

private const val DATABASE_NAME = "crime-database"
class CrimeRepository private constructor(context: Context) {
    private val database: CrimeDateBase = Room.databaseBuilder(
        context.applicationContext,
        CrimeDateBase::class.java,
        DATABASE_NAME
    ).build()
    private val crimeDao = database.crimeDao()
    fun getCrimes(): List<Crime> = crimeDao.getCrimes()
    fun getCrime(id: UUID): Crime? = crimeDao.getCrime(id)

    companion object {
        private var INSTANCE: CrimeRepository? = null
        fun initialize(context: Context) {
            if (INSTANCE == null) INSTANCE = CrimeRepository(context)
        }

        fun get(): CrimeRepository {
            return INSTANCE ?: throw IllegalStateException(
                "CrimeRep must be ini" +
                        "tialization"
            )
        }
    }
}