@file:Suppress("MISSING_DEPENDENCY_SUPERCLASS_IN_TYPE_ARGUMENT")

package main.kotlin.lessons.lesson13
//
//fun main() {
//    val food = mapOf(
//        "Овощи" to listOf("Картофель", "Морковь", "Лук"),
//        "Фрукты" to listOf("Яблоки", "Груши", "Апельсины"),
//        "Ягоды" to listOf("Виноград", "Клубника", "Голубика"),
//        "Орехи" to listOf("Арахис", "Фундук", "Макадамия"),
//        "Зелень" to listOf(),
//    )
//    val a1 = food.get("Овощи")
//    for ((key, value) in a1) {
//        println("Key: ${key}, Value: ${value}")
//    }
//    a1.forEach {
//        println("Key: ${it.key}, Value: ${it.value}")
//    }
//    val a2: List<String> = food.getValue("Фрукты")
//    val a3: List<String> = food.getOrDefault("Крупы", listOf())
//    val a4: List<String> = food.getOrElse("Рыба") {
//        println("Nety")
//        listOf()
//    }
//    if (!food.containsKey("Мясо") && !food.containsKey("Рыба")) {
//        println("Продукты для веганов")
//    }
//    val a5 = food.map { "${it.key} ${it.value}" }
//}