package com.example.kotlintutorial

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform