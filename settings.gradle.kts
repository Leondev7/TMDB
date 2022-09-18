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
rootProject.name = "TMDB"
include(
    ":app",
    ":core:ui",
    ":core:navigation",
    ":core:network",
    ":features:home:presentation",
    ":features:tvshows:di",
    ":features:tvshows:presentation",
    ":features:tvshows:data",
    ":features:tvshows:domain"
)