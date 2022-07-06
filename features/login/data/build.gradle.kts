plugins {
    id("android-base-lib")
    id("dagger.hilt.android.plugin")
}

dependencies {

    //implementation(project(":base:domain"))
    //implementation(project(":base:data:remote"))
    implementation(project(":features:login:domain"))
    remote()
    di()
}