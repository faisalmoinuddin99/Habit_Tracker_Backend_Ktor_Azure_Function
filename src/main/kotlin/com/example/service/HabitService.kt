package com.example.service

import com.example.model.Habit

interface HabitService {
    fun getHabit(): List<Habit>
    fun addHabit(habit: Habit)
}