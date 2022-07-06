//Top level build file where you can add configurations/options common to all sub-projects/modules.
buildscript {

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Classpath.gradle)
        classpath(Classpath.kotlin)
        //Note: Do not place your application dependencies here, they belong
        // in the individual module build.gradle files
        classpath(Classpath.hilt)
    }
}


tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}