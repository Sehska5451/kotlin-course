package main.kotlin.lessons.lesson15.homework

//Геометрические Фигуры
//Базовый класс: Геометрическая Фигура
open class Figures(val square: Double) {
}
//Производные классы: Многоугольник, Круг
open class advancedFigures(
    square: Double,
    val radius: Double
): Figures(square)

//Дополнительное разветвление для Многоугольник: Треугольник, Четырехугольник
open class moreAdvancedFigures(
    square: Double,
    val angeQuantity: Int
) : Figures(square)
