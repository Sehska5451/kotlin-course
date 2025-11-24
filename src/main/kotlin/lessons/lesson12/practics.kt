package main.kotlin.lessons.lesson12

fun main() {

    val theOnlyOne = listOf(1, 2, 2, 3, 4, -1, -100, 200, 300)

    val example1 = theOnlyOne.getOrElse(80) {5} //если индекса 80 нет, возьмет индекс 5

    theOnlyOne.joinToString(" ")

    println(theOnlyOne.sum())

    println(theOnlyOne.firstOrNull() { it < 0})

    println(theOnlyOne.contains(6))

    println(theOnlyOne.filter { it in 18..30 })

    println(theOnlyOne.filterNotNull())

    val textCollection = listOf<String>("One", "Two", "Three", "Four")

    println(textCollection.map { it.length }) // преобразовали каждое слово в длинну слова

    println(textCollection.associate { it to it.reversed() })

    println(textCollection.sorted())

    println(theOnlyOne.forEach { it * it })

    println(textCollection.groupBy { it.first() })






}