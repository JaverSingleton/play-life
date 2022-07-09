package ru.javersingleton.play_life.db.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.javersingleton.play_life.db.Database

@Component(modules = [DatabaseModule::class])
interface DatabaseComponent: Database {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun name(name: String): Builder

        @BindsInstance
        fun applicationContext(applicationContext: Context): Builder

        fun build(): DatabaseComponent

    }

}