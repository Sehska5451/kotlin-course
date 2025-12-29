package main.kotlin.lessons.lesson27

//Простая группа констант
object NumsObject {
    const val ONE = "ONE"
    const val TWO = "TWO"
    const val THREE = "THREE"
}

//Enum вместо констант
enum class Nums {
    ONE,
    TWO,
    THREE
}

fun main() {
    println(Nums.ONE)
    for (n in Nums.entries) {
        println(n)
    }
}

//Использование в when
//fun printNum(num: Nums) {
//    when(num) {
//        Nums.ONE -> println(1)
//    }
//}

//Enum в Kotlin может иметь конструктор, позволяющий определить дополнительные свойства для каждой константы.
// Это делает перечисления удобным инструментом для моделирования сложных данных.

enum class DayOfWeek(val dayNumber: Int, val isWeekend: Boolean) {
    MONDAY(1, false),
    TUESDAY(2, false),
    WEDNESDAY(3, false),
    THURSDAY(4, false),
    FRIDAY(5, false),
    SATURDAY(6, true),
    SUNDAY(7, true);

    fun printDayType() {
        if(isWeekend) println("$name is a weekend")
        else println("$name is a weekday")
    }
}

enum class CoffeeType(val cost: Double, val coffeeBase: String, val recommendedSugar: Int, val hasMilk: Boolean = false) {
    ESPRESSO(2.50, "Espresso", 0),
    LATTE(3.00, "Latte", 2, true),
    CAPPUCCINO(2.75, "Cappuccino", 1, true),
    AMERICANO(2.25, "Americano", 0);

    fun description() = "The $coffeeBase ${if (hasMilk) "with" else "without"} milk costs \$$cost and is best with $recommendedSugar spoons of sugar."
}