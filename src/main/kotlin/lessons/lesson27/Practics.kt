package main.kotlin.lessons.lesson27

enum class Seasons(val firstMonth: Int, val isVariableDuration: Boolean) {
    WINTER(12, true),
    SPRING(3, false),
    SUMMER(6, false),
    FALL(9, false),
    ;

    companion object{
        fun getSeason(month: Int): Seasons?{
            return entries.firstOrNull { it.firstMonth == month } ?: throw IllegalArgumentException("$month is wrong answer")
        }
    }
    fun seasonInfo() {
        println(firstMonth)
        println(isVariableDuration)
    }
}
fun main() {
    Seasons.SPRING.seasonInfo()

}
interface HasValue {
    val value: String
}

interface HasAction {
    fun action()
}

enum class Tech(override val value: String): HasValue, HasAction {
    VACUUM_CLEANER("Пылесос") {
        override fun action() {
            println("Сосет пыль")
        }
    },
    FRIDGE("Холодильник"){
        override fun action() {
            println("Охлаждает продукты")
        }
    },
    WASHING_MACHINE("Стиральная машина"){
        override fun action() {
            println("Стирает вещи")
        }
    },
    KETTLE("Чайник"){
        override fun action() {
            println("Кипятит воду")
        }
    },
    ;

    override fun action() {
        println("It works!")
    }

}