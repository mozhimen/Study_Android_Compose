pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Study_Android_Compose"
include(":basic")
//SwiftKit
include(":SwiftKit")
project(":SwiftKit").projectDir = File("D:\\WorkSpace\\GitHub\\SwiftKit")
include(":SwiftKit:basick")
include(":SwiftKit:composek")
//KUtilKit
include(":KUtilKit")
project(":KUtilKit").projectDir = File("D:\\WorkSpace\\GitHub\\KUtilKit")
include(":KUtilKit:utilk_android")
include(":KUtilKit:utilk_kotlin")
