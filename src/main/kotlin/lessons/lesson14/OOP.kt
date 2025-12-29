package main.kotlin.lessons.lesson14

fun main() {
    val lamp = Lamp(true)
    lamp.toggle()
    lamp.toggle()
    val wind = Wind(90.0)
    wind.setSpeed(9.0)
    wind.printSpeed()
}