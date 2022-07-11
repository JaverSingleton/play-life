pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "play-life"
include(
    ":app",
    ":repository:note:api",
    ":repository:note:impl",
    ":repository:project:api",
    ":repository:project:impl",
    ":screen:main",
    ":screen:project",
    ":di",
    ":db"
)
