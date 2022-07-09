package ru.javersingleton.play_life.di

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.javersingleton.play_life.screen.main.di.MainDependencies

@Module
interface DependenciesModule {

    @Binds
    @IntoMap
    @DependenciesKey(MainDependencies::class)
    fun bindMainDependencies(appComponent: AppComponent): Dependencies

}