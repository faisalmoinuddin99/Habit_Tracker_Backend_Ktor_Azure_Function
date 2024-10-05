package com.example.service

import com.example.model.Habit
import com.example.model.Priority

class HabitServiceImpl : HabitService {

    var habits = mutableListOf<Habit>(
        Habit(1, "Exercise", "Do every 30 minutes of training", priority = Priority.High),
        Habit(2, "Read", "Read 20 pages of book daily", priority = Priority.Medium)
    )

    override fun getHabit(): List<Habit> = habits

    override fun addHabit(habit: Habit) {
        habits.add(habit)
    }
}