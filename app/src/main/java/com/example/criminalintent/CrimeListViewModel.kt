package com.example.criminalintent

import androidx.lifecycle.ViewModel

class CrimeListViewModel: ViewModel() {
    val crimes = mutableListOf<Crime>()

    init {
        for (i in 0 until 100) {
            val crime = Crime()

            if (i % 8 == 0) {
                crime.type = "dangers"
                crime.title = "Crime #$i !norm"
                crime.isSolved = i % 2 == 0
            } else {
                crime.type = "norm"
                crime.title = "Crime #$i "
                crime.isSolved = i % 2 == 0
            }

            crimes += crime

        }
    }
}