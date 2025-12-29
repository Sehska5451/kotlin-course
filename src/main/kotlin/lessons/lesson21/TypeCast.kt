package main.kotlin.lessons.lesson21

//fun main() {
//    val obj: Any = "Hello, World!"
//    if (obj is String) {
//        println("Объект является строкой")
//    }
//    if (obj !is Int) {
//        println("Объект не является целым числом")
//    }
//    val safeStr: String? = num as? String // safeStr будет равно null
//    val num: Any = 123
//    val str: String = num as String // Выбросит ClassCastException
//
//    val nullableStr: String? = "Kotlin"
//    val nonNullableStr: String = nullableStr as String // Явное приведение типа
//
//    val mixedList: List<Any> = listOf("Kotlin", 42, 3.14, "Java", true)
//    for (item in mixedList) {
//        when (item) {
//            is String -> println("$item - строка длиной ${item.length}")
//            is Int -> println("$item - целое число")
//            is Double -> println("$item - вещественное число")
//            else -> println("Неизвестный тип")
//        }
//    }
//}