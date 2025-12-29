package main.kotlin.lessons.lesson14.homework

fun main() {

}
object Moon {
    fun visibility(){
        val isVisible: Boolean = true
        val phase: String = "Full Moon"
        fun showPhase() {
            if(isVisible) {
                println("Moon phase: $phase")
            } else {
                println("Moon is not visible")
            }
        }
    }
}