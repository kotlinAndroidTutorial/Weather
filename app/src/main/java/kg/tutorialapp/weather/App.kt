package kg.tutorialapp.weather

import android.app.Application
import kg.tutorialapp.weather.di.dataModule
import kg.tutorialapp.weather.di.vmModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App :Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(vmModule, dataModule))
        }
    }
}