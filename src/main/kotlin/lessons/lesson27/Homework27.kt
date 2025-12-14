package main.kotlin.lessons.lesson27

import main.kotlin.lessons.lesson12.filter


//Задание 1
//Создай Enum со статусами прохождения теста (passed, broken, failed).
//
enum class TestStatus {
    PASSED,
    BROKEN,
    FAILED,
    ;

    //Задание 3
//Создай функцию, которая принимает лямбду без аргументов и возвращаемого значения и возвращает Enum со статусом прохождения теста в зависимости от того как выполнится принятая лямбда:
//
//если без исключений - PASSED
//если будет AssertionError - FAILED
//прочие исключения  - BROKEN
    fun runTest(test: () -> Unit): TestStatus {
        return try {
            test()
            TestStatus.PASSED
        } catch (a: AssertionError) {
            TestStatus.FAILED
        } catch (b: Throwable) {
            TestStatus.BROKEN
        }
    }

}

//Создай Enum с типами жилой недвижимости для сайта аренды, включая человекопонятные названия этих типов.

enum class RealPropetiesTypes(val itsName: String) {
    APARTMENTS("Апартаменты"),
    FLAT("Квартира"),
    HOUSE("Дом"),
    ROOM("Комната"),
    ;

    //Задание 2
//Создай функцию, которая выводит на печать человекочитаемые названия типов недвижимости в порядке возрастания длины названия enum.
    companion object {
        fun printRealProperties() {
            entries
                .sortedByDescending { it.itsName.length }
                .forEach { println(it.itsName) }
        }
    }
}

//Создай Enum с планетами солнечной системы, включая расстояние до солнца в астрономических единицах и вес планеты.
enum class SolarSystem(val distanceToTheSunInMlnKm: Int, val planetMassInEarthMass: Double) {
    MERCURY(58, 0.055),
    VENUS(108, 0.815),
    EARTH(150, 1.0),
    MARS(228, 0.107),
    JUPITER(778, 318.0),
    SATURN(1429, 95.0),
    URANUS(2875, 14.5),
    NEPTUNE(4497, 17.0),
    ;

    //Задание 4
//Создай функцию, которая принимает лямбду и возвращает enum планеты. Лямбда должна принимать планету и возвращать булево значение.
// Лямбда здесь выступает в качестве фильтра, который должен отфильтровать список всех планет по какому-либо признаку (расстояние или вес).
// Вернуть нужно первый элемент из отфильтрованного списка или выкинуть исключение если список пустой.
    fun planetsmth(arg: (SolarSystem) -> Boolean): SolarSystem {
        val filteredPlanet = SolarSystem.values().filter(arg)
        if (filteredPlanet.isEmpty()) {
            throw NoSuchElementException("Подходящая планета не найдена")
        }
        return filteredPlanet.first()
    }
}

fun main() {
    RealPropetiesTypes.printRealProperties()
}
