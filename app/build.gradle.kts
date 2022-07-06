plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    //id("io.gitlab.arturbosch-detekt").version(Versions.detektPlugins)
}

android {
    compileSdk = DefaultConfig.compileSdk

    defaultConfig {
        applicationId = DefaultConfig.applicationId
        minSdk = DefaultConfig.minSdk
        targetSdk = DefaultConfig.targetSdk
        //TODO: Investigate version automation on code
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = TestBuildVersions.testInstrumentationRunner
        multiDexEnabled = true
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isShrinkResources = true
            isDebuggable = true
            isMinifyEnabled = true
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
            //Singing Configs
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }
}

dependencies {
    implementation(project(":features:login:presentation"))
    implementation(project(":core:navigation"))
    //Other core and feature:presentation modules
    compose()
    general()
    timber()
    imageLoader()
    di()
    //detekt()
}