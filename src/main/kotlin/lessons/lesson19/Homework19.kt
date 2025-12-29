package main.kotlin.lessons.lesson19

//1. Напиши функцию getMiddleElement с дженериком, которая будет принимать список и возвращать средний элемент, если он существует,
// иначе возвращать null. Например, у списка из четырёх элементов - среднего элемента нет.

//fun <T> getMiddleElement(list: List<T>): T? {
//    if (list.size % 2 == 0) return null   // нет среднего
//    return list[list.size / 2]
//}
//
//fun <K, V> transposition(map: Map<K, V>): Map<V, K> {
//    return map.entries.associate { (k, v) -> v to k }
//}


//fun main() {
//
//    println(getMiddleElement(listOf(1,2,3,4,5)))  // 3
//    println(getMiddleElement(listOf(1,2,3,4)))    // null
//
//    val holder = ListHolder<String>()
//    holder.add("Hello")
//    holder.add("World")
//    println(holder.getAll())
//
//    val mapper = PhrasesToListOfStrings()
//    println(mapper.mapItem("Hello world from Kotlin"))
//    println(mapper.mapList(listOf("one two", "three   four")))
//
//    val map = mapOf(1 to "A", 2 to "B")
//    println(transposition(map)) // {A=1, B=2}
//
//    val strValidator = StringValidator()
//    println(strValidator.validate(" Kotlin ")) // true
//    println(strValidator.validate("   "))      // false
//
//    val evenValidator = OddValidator()
//    println(evenValidator.validate(4))  // true
//    println(evenValidator.validate(5))  // false
//
//    val listValidator = ListValidator<Int>()
//    println(listValidator.validate(listOf(1,2,3)))       // true
//    println(listValidator.validate(listOf(1,0,3)))       // false
//    println(listValidator.validate(listOf(1,null,3)))    // false
//}

// 2 Напиши класс ListHolder, который будет хранить список элементов типа T
// и иметь метод для добавления нового элемента и получения всех элементов в виде неизменяемого списка.
class ListHolder <T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> = items.toList()
}

// 3 Создай интерфейс Mapper с двумя дженериками, который будет определять методы для преобразования:
//элементов одного типа в элементы другого типа
//списка элементов одного типа в список элементов другого типа

interface Mapper<F, T> {
    fun mapItem(item: F): T
    fun mapList(items: List<F>): List<T>
}

// 4 Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с типами String и List<String>.
// Метод преобразования должен разбивать входящую строку по символу пробела и возвращать список из полученных слов.
// Метод преобразования списков с аналогичной механикой.

//class PhrasesToListOfStrings : Mapper<String, List<String>> {
//    override fun mapItem(item: String): List<String> {
//        return item.split(" ").filter { it.isNotBlank() }
//    }
//
//    override fun mapList(items: List<String>): List<List<String>> {
//        return items.map { mapItem(it) }
//    }
//}

interface Validator<T> {
    fun validate(item: T): Boolean
}

//class StringValidator : Validator<String?> {
//    override fun validate(item: String?): Boolean {
//        return item != null && item.isNotBlank()
//    }
//}

//class OddValidator : Validator<Int> {
//    override fun validate(item: Int): Boolean {
//        return item % 2 == 0
//    }
//}

//class ListValidator<T : Number> : Validator<List<T?>> {
//    override fun validate(item: List<T?>): Boolean {
//        if (item.any { it == null }) return false
//        if (item.any { it!!.toDouble() == 0.0 }) return false
//        return true
//    }
//}