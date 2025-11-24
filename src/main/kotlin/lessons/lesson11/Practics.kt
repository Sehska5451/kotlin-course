package main.kotlin.lessons.lesson11

fun main() {
    println(a6(2, 3))
}

fun a1() {

}

fun a2(): String {
    return "sdgs"
}

fun a3(a: String) {

}

fun a4(a: Double, b: Double): Double {
    return a
}

fun a5(a: String?): Boolean {
    return true
}

fun a6(a: Int, b: Int): Int {
    return a + b
}

fun a7(a: Int, b: Int): Int {
    return if(a > b) {
         a
    } else  b
}

fun a8(a: List<Int>) {
    for(b in a) {
        if(b > 0) {
            println(b)
        } else if(b == 0) {
            println("This is 0")
        } else return
    }
}
// Напишите функцию replaceString, которая принимает список строк и искомую строку. Функция должна перебрать список и заменить первое вхождение искомой строки на её версию в верхнем регистре, после чего завершить выполнение с помощью return без возврата значения.
fun a9(a: MutableList<String>, b: String) {
    for(i in a.indices) {
        if(a[i].contains(b)) {
            a[i] = a[i].replace(b,b.uppercase())
            return
        }
    }
}
//Создайте функцию findFirstEvenNumber, которая принимает список целых чисел. Функция должна выводить каждый номер. При нахождении первого чётного числа она должна вывести сообщение "Чётное число найдено" и завершить выполнение с помощью return без возврата значения.
fun a10(a: List<Int>) {
    for(i in a) {
        println(i)
        if (i % 2 == 0) {
            println("Чётное число найдено")
            return
        }
    }
}

fun a11(a: Map<String, Double>): Double {
    var summ = 0.0
    for((key, value) in a) {
       summ += if (value < 0) {
           0 - value
       } else {
           value
       }
    }
    return summ
}