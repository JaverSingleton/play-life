package ru.javersingleton.play_life.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import ru.javersingleton.play_life.App
import ru.javersingleton.play_life.db.Database
import ru.javersingleton.play_life.screen.main.di.MainDependencies
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        DependenciesModule::class,
    ]
)
interface AppComponent :
    MainDependencies {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent

    }

    fun inject(app: App)

}