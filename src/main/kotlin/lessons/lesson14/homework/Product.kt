package main.kotlin.lessons.lesson14.homework

data class Product(val price: Double, val name: String, val quantity: Int) {

}
fun main() {
    val product = Product(4.9, "Milk", 120)
    println(product)
}