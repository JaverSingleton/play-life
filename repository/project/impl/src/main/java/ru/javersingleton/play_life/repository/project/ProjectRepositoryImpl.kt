package ru.javersingleton.play_life.repository.project

import kotlinx.coroutines.withContext
import ru.javersingleton.play_life.core.coroutines.Dispatchers
import ru.javersingleton.play_life.db.dao.ProjectDao
import ru.javersingleton.play_life.db.dto.ProjectDto
import ru.javersingleton.play_life.repository.core.IdGenerator
import javax.inject.Inject

class ProjectRepositoryImpl @Inject constructor(
    private val projectDao: ProjectDao,
    private val dispatchers: Dispatchers,
    private val idGenerator: IdGenerator
) : ProjectRepository {

    override suspend fun loadProjects(): List<Project> = withContext(dispatchers.io) {
        projectDao.getProjects().map {
            Project(
                id = it.id,
                title = it.title
            )
        }
    }

    override suspend fun createProject(project: Project) = withContext(dispatchers.io) {
        projectDao.insertProject(
            ProjectDto(
                id = idGenerator.generateId("project"),
                title = project.title,
                color = null
            )
        )
    }
}