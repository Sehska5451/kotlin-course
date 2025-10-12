package main.kotlin.lessons.lesson11

//Задачи на сигнатуру метода
//1. Не принимает аргументов и не возвращает значения.
fun homework1() {

}
//2. Принимает два целых числа и возвращает их сумму.
fun homework2(a: Int, b: Int) {
    return a + b
}
//3. Принимает строку и ничего не возвращает.
fun homework3(a: String) {

}
//4. Принимает список целых чисел и возвращает среднее значение типа Double.
fun homework4(a: List<Int>): Double {
    println(a.average())
}
//5. Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
fun homework5(a: String?): Int? {
    return a?.length
}
//6. Не принимает аргументов и возвращает nullable вещественное число.
fun homework6(): Double? {

}
//7. Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
fun homework7(a: List<Int?>) {

}
//8. Принимает целое число и возвращает nullable строку.
fun homework8(a: Int): String? {

}
//9. Не принимает аргументов и возвращает список nullable строк.
fun homework9(): List<String?> {

}
//10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun homework10(a: String?, b: Int?): Boolean? {

}
//Задачи на написание кода
//11. Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(a: Int): Int {
    return a * 2
}
//12. Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(a: Int): Boolean {
    if(a % 2 == 0) {
        return true
    } else return false
}
//13. Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int): List<Double> {
    for(i in 1..n) {
        println(i)
    }
    if(n < 1) return
}
//14. Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(a: List<Int>): Int {
    for (i in a) {
        if (i < 0) {
            return i
        } else return "null"
    }
}
//15. Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(a: List<String?>): String {
    for (i in a) {
        if (i != null) {
            println(i)
        } else return
    }
}