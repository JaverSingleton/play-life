package ru.javersingleton.play_life.screen.main.di

import dagger.Component
import ru.javersingleton.play_life.screen.main.MainActivity

@Component(
    dependencies = [MainDependencies::class]
)
interface MainComponent {


    @Component.Builder
    interface Builder {

        fun withDependencies(dependencies: MainDependencies): Builder

        fun build(): MainComponent

    }

    fun inject(activity: MainActivity)

}