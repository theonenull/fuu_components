import org.gradle.api.internal.artifacts.mvnsettings.LocalMavenRepositoryLocator

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
        maven("https://jitpack.io" )
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        mavenLocal()
        maven("https://jitpack.io" )
    }
}

rootProject.name = "fuu_components"
include(":app")
include(":fuu_library")
