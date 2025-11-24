package main.kotlin.lessons.lesson09

fun main () {

    val numbers: Array<Int> = arrayOf(1, 2 ,3 ,4 ,5)

    val doubles: DoubleArray = doubleArrayOf(1.1, 1.2, 1.3, 1.4)

    val eptyArray = Array(5) { "" }

    val emptyArray = Array<String?>(5) {null}

    val emptyNullableArray = arrayOfNulls<Int>(5)

    var readOnlyList: List<String> = listOf("a", "b", "c")

    var nulableList: MutableList<String> = mutableListOf("a", "b", "c")
    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")

    numbers[0] = 10

    mutableList.add("d")
    mutableList.removeAt(0)
    mutableList.remove("c")
    mutableList.add(1, "c")
    mutableList[0] = "e"

    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5)

    val mutableNumbersSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)

    mutableNumbersSet.add(6) // добавляет элемент
    mutableNumbersSet.remove(1) // удаляет элемент


    val set = setOf("K", "o", "t", "i", "n")
    for (letter in set) {
        println("| $letter |")
    }

    val list = listOf(32, 53,1, -76)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[index + 1])
        }
    }

}