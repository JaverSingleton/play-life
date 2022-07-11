package ru.javersingleton.play_life.screen.project

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import ru.javersingleton.play_life.di.findDependencies
import ru.javersingleton.play_life.repository.project.ProjectRepository
import ru.javersingleton.play_life.screen.project.di.DaggerProjectComponent
import javax.inject.Inject


class ProjectActivity : AppCompatActivity() {

    @Inject
    lateinit var projectRepository: ProjectRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerProjectComponent.builder()
            .withDependencies(findDependencies())
            .build()
            .inject(this)
        setContent {

        }
    }
}