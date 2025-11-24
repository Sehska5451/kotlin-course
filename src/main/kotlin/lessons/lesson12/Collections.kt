package main.kotlin.lessons.lesson12

fun main() {

    val numbers = listOf(-1, -2, -3, -4, -5, 8, 264)

    val positive = mutableListOf<Int>()

    for(i in numbers) {
        val isPositive = i > 0
        if(isPositive) {
            positive.add(i)
        }
    }

    numbers.forEach {
        // it - переменная в котлин для хранения значения коллекции из текущей итерации
        val isPositive = it > 0
        if (isPositive) {
            positive.add(it)
        }
    }
    val list = listOf(1, 2, 3, 4, 5, 7, 7, 12, 13, 15)
    val filtered1 = filter(list)
    println(filtered1)

    val filtered2 = list.filter {
       it in 7..17
    }
    println(filtered2)

    val positiveFiltered = numbers.filter { it > 0 }

    val notPositiveNumbers = numbers.filterNot { it > 0 }
    println(notPositiveNumbers)

    val nullableList = listOf(1, null, 2, null, 3, null)
    val nonNullList = nullableList.filterNotNull()
    println(nonNullList)


    list[list.lastIndex]

    list.first()

    list.first { it > 0 } // фильтрует по значению, а не по индексу

    list.last()

    list.last { it > 0 }

    val setOfNumbers = setOf(3, 4, 5, 6, 7, 8, 9)
    val firstElement = setOfNumbers.first()
    val lastElement = setOfNumbers.last()

    val firstPositive = numbers.firstOrNull { it > 0 }
    println(firstPositive)
    val nullable = numbers.firstOrNull { it > 1000 }
    println(nullable)
    val elementOrElse = numbers.getOrElse(10) { -1 }
    println(elementOrElse)

    val incrementedNumbers = numbers.map { it + 1 }
    println(incrementedNumbers)

    val numberSquareMap = numbers.associate { it to it * it }
    println(numberSquareMap)

    val multipleList = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6)
    )

    val flattenList = multipleList.flatten()
    println(flattenList)

    val flattenListAfterMapping = multipleList.flatMap { list ->
        list.map { it * 2 }
    }
    println(flattenListAfterMapping)

    val numberString = numbers.joinToString(separator = " : ") { "${it * 2}" }
    println(numberString)

    val sortedNumbers = numbers.sorted() //сортирует по возрастанию
    println(sortedNumbers)


    val sortedDescendingNumbers = numbers.sortedDescending()
    println(sortedDescendingNumbers)

    println(numbers.size)

    if (numbers.isEmpty()) {
        println("Коллекция пуста")
    } else {
        println("Колеекция не пуста")
    }

    if (42 in numbers) {
        println()
    }

    if (setOfNumbers.containsAll(listOf(4,3))) {

    }

    val sumOfNumbers = numbers.sum()
    println(sumOfNumbers)

    val averageOfNumbers = numbers.average()
    println(averageOfNumbers)

    val maxNumber = numbers.maxOrNull()
    println(maxNumber)

    val minNumber = numbers.minOrNull()
    println(minNumber)

    val groupeBysign = numbers.groupBy { if (it > 0) "Positive" else "Negative" }
    println(groupeBysign)

    val distinctNumbers = listOf(1, 2, 2, 3, 3, 4, 4, 5, 5).distinct()
    println(distinctNumbers) //очищает от дублей

    println(numbers.take(3)) // берет первые 3 элемента из списка

    println(numbers.takeLast(3)) // берет 3 последних элемента из списка

    println(numbers.drop(2)) // берет весь список без первых 2 значений



}

fun filter(collection: List<Int>): Int {
    val result = mutableListOf<Int>()
    for(i in collection) {
        if (i in 7..17) result.add(i)
    }
    return result

}

