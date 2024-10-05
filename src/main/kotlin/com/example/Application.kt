package com.example

import com.example.plugins.*
import com.example.service.HabitServiceImpl
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {

    val habitService = HabitServiceImpl()

    configureSerialization()
    configureRouting(habitService)
    
}
