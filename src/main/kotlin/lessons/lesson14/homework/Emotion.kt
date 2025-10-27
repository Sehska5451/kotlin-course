package main.kotlin.lessons.lesson14.homework

class Emotion(val type: String, val intensity: Int) {
    fun express() {
        when() {
            type == "Good" && intensity in 7..10 -> println("This party is awesome")
            type == "Neutral" && intensity in 4..6 -> println("This party is just OKAY")
            type == "Bad" && intensity in 1..3 -> println("This party is really bad")
        }
    }
}