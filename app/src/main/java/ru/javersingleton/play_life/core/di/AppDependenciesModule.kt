package ru.javersingleton.play_life.core.di

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.javersingleton.play_life.screen.main.di.MainDependencies
import ru.javersingleton.play_life.screen.project.di.ProjectDependencies

@Module
interface AppDependenciesModule {

    @Binds
    @IntoMap
    @DependenciesKey(MainDependencies::class)
    fun bindMainDependencies(appComponent: AppComponent): Dependencies

    @Binds
    @IntoMap
    @DependenciesKey(ProjectDependencies::class)
    fun bindProjectDependencies(appComponent: AppComponent): Dependencies

}

interface AppDependencies :
    MainDependencies,
    ProjectDependencies