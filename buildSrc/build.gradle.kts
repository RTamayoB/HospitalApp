import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation("com.android.tools.build:gradle:7.2.1")

    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")

    implementation("com.squareup:javapoet:1.13.0")
    implementation(kotlin("script-runtime"))
}