import org.gradle.api.artifacts.dsl.DependencyHandler

object Versions {
    const val gradle = "7.2.1"
    const val kotlin = "1.6.10"
    const val fragmentKtx = "1.4.1"
    const val hilt = "2.42"
    const val coreKtx = "1.8.0"
    const val appCompat = "1.4.2"
    const val googleMaterial = "1.5.0"
    const val multidex = "2.0.1"
    const val lifecycle = "2.4.1"
    const val coroutines = "1.6.0"
    const val inject = "1"
    const val timber = "5.0.1"
    const val retrofit = "2.9.0"
    const val loggingInterceptor = "5.0.0-alpha.7"
    const val gson = "2.9.0"
    const val picasso = "2.8"
    const val detektPlugins = "1.20.0"
    const val compose = "1.1.1"
    const val composeActivity = "1.4.0"
    const val composeViewModel = "2.4.1"
    const val composeConstraintLayout = "1.0.1"
    const val coil = "2.1.0"
    //Testing
    const val jUnit = "4.13.2"
    const val archCore = "2.1.0"
    const val coroutineTest = "1.6.0"
    const val mockito = "4.4.0"
    const val mockitoKotlin = "4.0.0"
    const val mockWebServer = "4.9.3"
}

object Classpath {
    const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
}

object DefaultConfig {
    const val compileSdk = 32
    const val minSdk = 21
    const val targetSdk = 32
    const val applicationId = "com.hospitalapp.app"
}

object Dependencies {

    object  AndroidX {
        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}"
        const val multidex = "androidx.multidex:multidex:${Versions.multidex}"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
        const val lifecyle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
        const val viewModelSavedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycle}"
        const val lifeCycleCommonJava8 = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"
        const val composeActivity = "androidx.activity:activity-compose:${Versions.composeActivity}"
        const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
        const val composeAnimation = "androidx.compose.animation:animation:${Versions.compose}"
        const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
        const val composeViewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.composeViewModel}"
        const val constraintLayoutCompose = "androidx.constraintlayout:constraintlayout-compose:${Versions.composeConstraintLayout}"
    }

    object Coil {
        const val lib = "io.coil-kt:coil-compose:${Versions.coil}"
    }

    object Google {
        const val composeThemeAdapter = "com.google.android.material:compose-theme-adapter:${Versions.compose}"
        const val googleMaterial = "com.google.android.material:material:${Versions.googleMaterial}"
        const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
        const val gson = "com.google.code.gson:gson:${Versions.gson}"
    }

    object Coroutine {
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    }

    object JavaX {
        const val javaxInject = "javax.inject:javax.inject:${Versions.inject}"
    }

    object SquareUp {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"
        const val picasso = "com.squareup.picasso:picasso:${Versions.picasso}"
    }

    object Timber {
        const val lib = "com.jakewharton.timber:timber:${Versions.timber}"
    }

    object Detekt {
        const val detektPlugins = "io.gitlab.arturbosch.detekt:detekt-formatting:${Versions.detektPlugins}"
    }
}

fun DependencyHandler.general() {
    implementation(Dependencies.Google.googleMaterial)
    implementation(Dependencies.AndroidX.coreKtx)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.AndroidX.multidex)
    implementation(Dependencies.AndroidX.viewModel)
    implementation(Dependencies.AndroidX.fragment)
    implementation(Dependencies.AndroidX.liveData)
    implementation(Dependencies.AndroidX.lifecyle)
    implementation(Dependencies.AndroidX.viewModelSavedState)
    implementation(Dependencies.AndroidX.lifeCycleCommonJava8)
}

fun DependencyHandler.coroutines() {
    implementation(Dependencies.Coroutine.coroutines)
}

fun DependencyHandler.di() {
    implementation(Dependencies.Google.hilt)
    kapt(Dependencies.Google.hiltCompiler)
    implementation(Dependencies.JavaX.javaxInject)
}

fun DependencyHandler.timber() {
    implementation(Dependencies.Timber.lib)
}

fun DependencyHandler.remote() {
    implementation(Dependencies.SquareUp.retrofit)
    implementation(Dependencies.Google.gson)
    implementation(Dependencies.SquareUp.gsonConverter)
    implementation(Dependencies.SquareUp.loggingInterceptor)
}

fun DependencyHandler.imageLoader() {
    implementation(Dependencies.SquareUp.picasso)
}

fun DependencyHandler.compose() {
    implementation(Dependencies.AndroidX.composeActivity)
    implementation(Dependencies.AndroidX.composeMaterial)
    implementation(Dependencies.AndroidX.composeAnimation)
    implementation(Dependencies.AndroidX.composeUiTooling)
    implementation(Dependencies.AndroidX.composeViewModel)
    implementation(Dependencies.AndroidX.constraintLayoutCompose)
    implementation(Dependencies.Google.composeThemeAdapter)
    implementation(Dependencies.Coil.lib)
}

fun DependencyHandler.detekt() {
    add("detektPlugins", Dependencies.Detekt.detektPlugins)
}

fun DependencyHandler.implementation(dependencyName: String) {
    add("implementation", dependencyName)
}

fun DependencyHandler.kapt(dependencyName: String) {
    add("kapt", dependencyName)
}