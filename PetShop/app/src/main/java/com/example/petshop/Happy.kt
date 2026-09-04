package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun mood(): String {
        return "I'm happy"
    }
}