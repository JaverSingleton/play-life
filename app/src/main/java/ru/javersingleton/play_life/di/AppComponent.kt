package ru.javersingleton.play_life.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import ru.javersingleton.play_life.App
import ru.javersingleton.play_life.db.NoteDatabase
import ru.javersingleton.play_life.screen.main.di.MainDependencies
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        DependenciesModule::class,
    ],
    dependencies = [NoteDatabase::class]
)
interface AppComponent :
    MainDependencies,
    NoteDatabase {

    @Component.Builder
    interface Builder {

        fun noteDatabase(noteDatabase: NoteDatabase): Builder

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent

    }

    fun inject(app: App)

}