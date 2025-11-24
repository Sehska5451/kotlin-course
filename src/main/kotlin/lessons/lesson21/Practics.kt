package main.kotlin.lessons.lesson21

fun main() {
//Создай переменную типа Any и инициализируй её строкой
    val arg1: Any = "Stroka"
//Приведи переменную к строке и распечатай
    println((arg1 as String).length)
//Приведи переменную к числу Int и распечатай
   // println(arg1 as Int)
//Проверь, что переменная является строкой и распечатай, иначе выведи сообщение что это не строка
    if(arg1 is String) {
        println(arg1)
    } else {
        println("3to ne stroka")
    }

//Переделай на безопасную проверку типов вместо if
    println(arg1 as? String ?: "3to ne stroka")

//Создай переменную типа Any и инициализируй её списком строк
    val arg2: Any = listOf("asd")
//Приведи переменную к списку строк и распечатай
    println(arg2 as List<String>)
//Приведи переменную к списку чисел и распечатай
    println(arg2 as List<Int>)
//Приведи к списку чисел, обратись к нулевому элементу и выполни любой метод
    println((arg2 as List<Int>)[0].toDouble())
//Проверь, что переменная является списком строк (не получится, нужно использовать звёздочку) и распечатай нулевой элемент.
    if (arg2 is List<*>) {
        println(arg2[0])
    } else {
        println("0")
    }
//Проверь что элемент списка является строкой и распечатай его, иначе выведи сообщение об ошибке.
    if(arg2[0] is String && (arg2 as List<*>).isNotEmpty()) {
        println(arg2[0])

    }
}