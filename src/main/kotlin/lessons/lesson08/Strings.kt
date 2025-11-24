package main.kotlin.lessons.lesson08

fun main () {

    val simpleString = "Это простая строка"

    val FirstName = "Ivan"
    val lastName = "Petrov"
    val fullName = FirstName + "" + lastName // "Ivan Petrov"

    val age = 30
    val greeting = "Привет! Меня зовут $FirstName, и мне $age лет"


    class Person(val name: String, val age: Int)

    val person = Person("Alex", 25)
    val introduction = "My name is ${person.name}, и мне ${person.age}"

    val details = "Здесь находятся ${getDetails()}"



    val originalString = "Kotlin is fun"
    val subString = originalString.substring(7) // is fun
    val subString2 = originalString.substring(3, 6) // lin

    val replacedString = originalString.replace("fun", "awesome") // Kotlin is awesome
    val words = originalString.split(" ") // [Kotlin, is, fun]

    val length = "Hello Kotlin".length // 12

    val upper = "hello".uppercase() // HELLO
    val lower = "HELLO".lowercase() // hello

    val trimmed = " hello  ".trim() // hello

    val starts = "Kotlin".startsWith("Kot") // true

    val ends = "Kotlin".endsWith("lin") // true

    val contains = "Hello".contains("llo") // true

    val empty = "".isNullOrEmpty() // true

    val blank = "   ".isNullOrBlank() // true

    val repeat = "ab".repeat(3) // ababab

    val letter = originalString[5] // n вызывает символ с индексом 5

    val indexOfChar = "Kotlin".indexOf("t") // 2 возвращает индекс

    val backReverse = "Kotlin".reversed() // niltoK

    val multilineString = """
        First string
        Second string 
        Third string
        """.trimIndent()


    val name = "Alex"
    val city = "Tbilisi"
    val age1 = 32
    val friendsCount = 103
    val rating = 4.5654
    val balance = 23456.5576
    val text = """
        Name: %s
        City: %s
        Age: %d
        Frinds count: %, d
        User's rating: %.1f
        Balance: $%, .2f
        """.trimIndent()
    println(text.format(name, city, age, friendsCount, rating, balance))

}

fun getDetails(): String {
    return "очень интересные детали"
}