package com.cradlesoft.hospitalapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform