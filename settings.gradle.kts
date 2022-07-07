dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "HospitalApp"

include(":app")

include(":core:navigation")
include(":core:presentation:ui")

include(":features:login:data")
include(":features:login:domain")
include(":features:login:presentation")
