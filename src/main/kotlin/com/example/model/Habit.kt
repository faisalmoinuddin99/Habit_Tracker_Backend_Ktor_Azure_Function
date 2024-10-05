package com.example.model

import kotlinx.serialization.Serializable

enum class Priority {
    Low, Medium, High, Vital
}

@Serializable
data class Habit(
    private val id: Int,
    private val name: String,
    private val description: String,
    private val priority: Priority
)
