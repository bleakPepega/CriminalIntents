package database

import android.app.Application
import com.example.criminalintent.CrimeRepository

class CriminalIntentApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}