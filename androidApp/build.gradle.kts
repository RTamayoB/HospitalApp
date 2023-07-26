plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.cradlesoft.hospitalapp.android"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.cradlesoft.hospitalapp.android"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.4"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    flavorDimensions.add("role")
    productFlavors {
        create("patient") {
            applicationId = "com.cradlesoft.hospitalapp.patient.android"
            dimension = "role"
            versionCode = 1
            versionName = "1.0"
        }
        create("staff") {
            applicationId = "com.cradlesoft.hospitalapp.staff.android"
            dimension = "role"
            versionCode = 1
            versionName = "1.0"
        }
    }
    sourceSets {
        getByName("staff") {
            java {
                srcDir("src/staff/java")
            }
            res {
                srcDir("src/staff/res")
            }
        }
        getByName("patient") {
            java.srcDir("src/patient/java")
            java.srcDir("src/patient/kotlin")
            java.srcDir("src/patient/res")
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("androidx.compose.ui:ui:1.4.3")
    implementation("androidx.compose.ui:ui-tooling:1.4.3")
    implementation("androidx.compose.ui:ui-tooling-preview:1.4.3")
    implementation("androidx.compose.foundation:foundation:1.4.3")
    implementation("androidx.compose.material3:material3-android:1.2.0-alpha03")
    implementation("androidx.compose.material:material:1.4.3")
    implementation("androidx.activity:activity-compose:1.7.2")
}