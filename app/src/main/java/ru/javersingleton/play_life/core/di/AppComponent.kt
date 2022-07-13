package ru.javersingleton.play_life.core.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import ru.javersingleton.play_life.App
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        AppDependenciesModule::class,
    ]
)
interface AppComponent : AppDependencies {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent

    }

    fun inject(app: App)

}