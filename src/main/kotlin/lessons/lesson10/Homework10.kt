package main.kotlin.lessons.lesson10

fun main() {
//Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val m1: Map<Int, Int> = mapOf()
//Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val m2: Map<Float, Double> = mapOf(1.32f to 12.43, 2.34f to 10.8)
//Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val m3 = mutableMapOf<Int, String>(1 to "String1", 2 to "String2")
//Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    m3[3] = "String3"
//Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
    if(3 in m3) {
        println(m3[3])
    } else {
        println("Key not found")
    }
//Удалите определенный элемент из изменяемого словаря по его ключу.
    m3.remove(1)
//Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val m4 = mapOf<Double, Int>(1.11 to 1, 2.22 to 2, 3.33 to 3)
    for((key, value) in m4) {
        if(value == 0) {
            println("Infinity")
        }
        println(key % value)
    }
//Измените значение для существующего ключа в изменяемом словаре.
    m3[2] = "String2022"
//Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val m5 = mapOf<Int, Int>(1 to 2, 2 to 3, 3 to 4)
    val m6 = mapOf<Int, Int>(4 to 5, 5 to 6, 6 to 7)
    val m7: MutableMap<Int, Int> = mutableMapOf()

    for((key1, value1) in m5) {
        m7[key1] = value1
    }
    for((key1, value1) in m6) {
        m7[key1] = value1
    }
//Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
    val m8 = mapOf<String, List<Int>>(
        "String1" to listOf(1, 2, 3),
        "String2" to listOf(4, 5, 6),
        "String3" to listOf(7, 8, 9)
    )
//Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.
    val m9 = mapOf<Int, MutableSet<String>>(
        1 to mutableSetOf("String1", "String2", "String3"),
        2 to mutableSetOf("String4", "String5", "String6"),
        3 to mutableSetOf("String7", "String8", "String9")
    )
    println(m9[2])
    m9[2] = mutableSetOf<String>("String4", "String5", "String6", "String10")
//Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.
    val m10 = mapOf<Map<Int,Int>, Map<Int, Int>>(
        mapOf(1 to 2) to mapOf(3 to 4),
        mapOf(3 to 4) to mapOf(5 to 6),
        mapOf(5 to 6) to mapOf(6 to 7),
        mapOf(6 to 7) to mapOf(8 to 9)
    )
    for((key2, value2) in m10) {
        if(m10[value2] == 5) {
            println(m10[value2])
            break
        }
    }
//Задачи на подбор оптимального типа для словаря
//Словарь библиотека: Ключи - автор книги, значения - список книг
    val m11 = mutableMapOf<String, List<String>>()
//Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val m12 = mapOf<String, List<String>>()
//Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val m13 = mutableMapOf<String, List<String>>()
//Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
    val m14 = mutableMapOf<String, List<String>>()
//Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
    val m15 = mutableMapOf<String, List<String>>()
}