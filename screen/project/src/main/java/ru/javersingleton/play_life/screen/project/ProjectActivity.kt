package ru.javersingleton.play_life.screen.project

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch
import ru.javersingleton.play_life.core.di.findDependencies
import ru.javersingleton.play_life.repository.project.Project
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
            val coroutineScope = rememberCoroutineScope()
            val text = remember { mutableStateOf("") }
            LaunchedEffect(null) {
                text.value = projectRepository.loadProjects().map { it.title }.joinToString(", ")
            }

            Column {
                Text(
                    text = text.value
                )
                Button(onClick = {
                    coroutineScope.launch {
                        projectRepository.createProject(Project(title = "Test"))
                        text.value = projectRepository.loadProjects().map { it.title }.joinToString(", ")
                    }
                }) {
                    Text(text = "Add")
                }
            }
        }
    }
}