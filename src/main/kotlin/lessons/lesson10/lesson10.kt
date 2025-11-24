package main.kotlin.lessons.lesson10

fun main() {

    val pair = 1 to "a"


    val emptyMap = mapOf<String, String>() // 1 тип - ключ, 2 тип - значение. Тут создали пустой словарь

    val capitals: Map<String, String> = mapOf("Россия" to "Москва", "Франция" to "Париж")

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")

         //val mutableCapitals = MutableMap<String, String> = mutableMapOf("Россия" to "Москва", "Франция" to "Париж")

    val vapitalOfRussia = capitals["Россия"]

    for((country, capital) in capitals) {
        println("$country: $capital")
    }

    if("Россия" in capitals) {
        println("Столица России: ${capitals["Россия"]}")
    }

    val mapWithNullableKey = mutableMapOf<String?, Int>(null to 1)

    val map4 = mutableMapOf("a" to 1, "b" to 1, "c" to 2)




}