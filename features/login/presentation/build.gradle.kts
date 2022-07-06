plugins {
    id("android-base-lib")
    //id("dagger.hilt.android.plugin")
}

android {
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }
}

dependencies {
    //implementation(project(":core:domain"))
    //implementation(project(":core:utils"))
    implementation(project(":core:navigation"))
    //implementation(project(":core:presentation:ui"))
    implementation(project(":features:login:domain"))
    implementation(project(":features:login:data"))

    general()
    compose()
    di()
}