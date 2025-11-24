package main.kotlin.lessons.lesson14

class Wind(private var speed: Double) {
    fun convertToMetersPerSecond(): Double {
        return speed / 3.6
    }
    fun setSpeed(speed: Double) {
        if(speed < 0) {
            return
        } else {
            this.speed = speed
        }
    }
    fun printSpeed() {
        println(speed)
    }
}