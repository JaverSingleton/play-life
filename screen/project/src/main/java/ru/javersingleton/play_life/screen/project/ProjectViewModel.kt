package ru.javersingleton.play_life.screen.project

import androidx.lifecycle.ViewModel
import ru.javersingleton.play_life.screen.project.di.ProjectDependencies
import javax.inject.Inject


class ProjectViewModel(
    private val dependencies: ProjectDependencies
) : ViewModel() {

    @Inject
    lateinit var feature: ProjectFeature

    init {

    }
}