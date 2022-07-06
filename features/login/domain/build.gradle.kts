plugins {
    id("android-base-lib")
}

dependencies {
    //implementation(project(":core:domain"))
    coroutines()
    implementation(Dependencies.JavaX.javaxInject)
}