package com.example.plugins

import com.example.model.Habit
import com.example.model.Priority
import com.example.service.HabitServiceImpl
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.request.receive
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(habitService: HabitServiceImpl) {


    routing {
        route("/api/v1") {
            // Example route to send all habits in JSON format
            get("/habits") {
                call.respond(habitService.getHabit()) // This will automatically convert the list of habits to JSON
            }
            // POST request to add a new habit in JSON format
            post("/habit") {
                val newHabit = call.receive<Habit>() // Automatically converts the JSON request body to a Habit object
                habitService.addHabit(newHabit)
                call.respond("Habit added successfully")
            }
        }
    }
}
