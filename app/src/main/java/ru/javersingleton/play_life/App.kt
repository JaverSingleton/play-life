package ru.javersingleton.play_life

import android.app.Application
import ru.javersingleton.play_life.core.di.DaggerAppComponent
import ru.javersingleton.play_life.core.di.Dependencies
import ru.javersingleton.play_life.core.di.HasDependencies
import javax.inject.Inject

open class App : Application(), HasDependencies {

    @Inject
    override lateinit var dependencies: Map<Class<out Dependencies>, @JvmSuppressWildcards Dependencies>
        protected set


    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.builder()
            .application(this)
            .build()
            .inject(this)

    }

}