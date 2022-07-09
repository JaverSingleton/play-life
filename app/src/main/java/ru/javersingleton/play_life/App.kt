package ru.javersingleton.play_life

import android.app.Application
import ru.javersingleton.play_life.db.RoomNoteDatabase
import ru.javersingleton.play_life.di.DaggerAppComponent
import ru.javersingleton.play_life.di.Dependencies
import ru.javersingleton.play_life.di.HasDependencies
import javax.inject.Inject

open class App : Application(), HasDependencies {

    @Inject
    override lateinit var dependencies: Map<Class<out Dependencies>, @JvmSuppressWildcards Dependencies>
        protected set


    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.builder()
            .application(this)
            .noteDatabase(
                RoomNoteDatabase.Builder()
                    .name("database")
                    .applicationContext(this)
                    .build()
            )
            .build()
            .inject(this)

    }

}