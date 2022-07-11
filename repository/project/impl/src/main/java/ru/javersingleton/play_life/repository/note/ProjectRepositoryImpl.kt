package ru.javersingleton.play_life.repository.note

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import ru.javersingleton.play_life.db.dao.ProjectDao
import ru.javersingleton.play_life.db.dto.ProjectDto
import ru.javersingleton.play_life.repository.project.Project
import ru.javersingleton.play_life.repository.project.ProjectRepository
import javax.inject.Inject

class ProjectRepositoryImpl(
    private val projectDao: ProjectDao
) : ProjectRepository {
    override fun getProjects(): Flow<List<Project>> =
        projectDao.getProjects().map { projects ->
            projects.map {
                Project(
                    id = it.id,
                    title = it.title
                )
            }
        }
}