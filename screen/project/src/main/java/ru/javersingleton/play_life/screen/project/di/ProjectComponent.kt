package ru.javersingleton.play_life.screen.project.di

import dagger.Component
import ru.javersingleton.play_life.screen.project.ProjectActivity

@Component(
    dependencies = [ProjectDependencies::class]
)
interface ProjectComponent {


    @Component.Builder
    interface Builder {

        fun withDependencies(dependencies: ProjectDependencies): Builder

        fun build(): ProjectComponent

    }

    fun inject(activity: ProjectActivity)

}