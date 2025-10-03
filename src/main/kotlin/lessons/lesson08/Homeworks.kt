package main.kotlin.lessons.lesson08

fun main() {
    exercise1("Этот код работает без проблем")
    exercise2("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    exercise3("4539 1488 0343 6467")
    exercise4("username@example.com")
    exercise5("C:/Пользователи/Документы/report.txt")
    exercise6("Коварынй отличник тянет лешения из нейросети")
}
// 1. Преобразование строк

fun exercise1(arg: String) {
    val result = when {
        arg.contains("невозможно") -> arg.replace("невозможно", "совершенно точно возможно, просто требует времени")
        arg.startsWith("Я не уверен") -> println("$arg, но моя интуиция говорит об обратном")
        arg.contains("катастрофа") -> arg.replace("катастрофа", "интересное событие")
        arg.endsWith("без проблем") -> arg.replace("без проблем", "с парой интересных вызовов на пути")
        //arg.trim() -> println("Иногда, $arg , но не всегда")
        else -> arg
    }
    println(result)
}

// Извлечение даты из строки лога
fun exercise2(arg: String) {
    val parts = arg.split("->")
    val rightPart = parts[1].trim()
    val dataTime = rightPart.split(" ")
    val date = dataTime[0]
    val time = dataTime[1]
    println(date)
    println(time)
}

//Маскирование личных данных
// Дана строка с номером кредитной карты, например "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех, символами "*".
fun exercise3(arg: String) {
    val parts = arg.split(" ")
    println(
        arg
            .replaceRange(0..3, "****")
            .replaceRange(5..8, "****")
            .replaceRange(10..13, "****")
    )
}

// Форматирование адреса электронной почты.
//У вас есть электронный адрес, например "username@example.com". Преобразуйте его в строку "username [at] example [dot] com", используя функцию replace()
fun exercise4(arg: String) {
    println(
        arg
            .replace("@", " [at] ")
            .replace(".", " [dot] ")
    )
}

//Извлечение имени файла из пути.
//Дан путь к файлу, например "C:/Пользователи/Документы/report.txt" или "D:/good.themes/dracula.theme" (может быть любым). Извлеките название файла с расширением.
fun exercise5(arg: String) {
    val array = arg.split("/")
    val lastElement = array[array.lastIndex]
    println(lastElement)
}
//Создание аббревиатуры из фразы.
//У вас есть фраза, например "Котлин лучший язык программирования" (может быть любой с разделителями слов - пробел). Создайте аббревиатуру из начальных букв слов (например, "ООП").
//Используйте split. Используйте for для перебора слов. Используйте var переменную для накопления первых букв.

fun exercise6(arg: String) {
    val words = arg.split(" ")
    var counter = ""
    for(i in words) {
        counter += i[0].uppercase()
    }
    println(counter)
}