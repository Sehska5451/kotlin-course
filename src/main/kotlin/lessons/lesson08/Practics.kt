package main.kotlin.lessons.lesson08
fun main() {
    example1("Ошибка в системе вызвала панику")  // было "вызввла"
}

fun example1(arg: String) {
    val result = when {
        arg.startsWith("Ошибка") -> arg.replace("Ошибка", "Небольшое недоразумение")
        arg.endsWith("важно") -> "$arg ... но не критично"
        else -> arg
    }
    println(result)
}