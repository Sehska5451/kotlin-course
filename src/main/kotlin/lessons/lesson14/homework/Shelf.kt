package main.kotlin.lessons.lesson14.homework

class Shelf(val capacity: Int, val items: mutableList<String>) {
    fun addItem(itemName: String): Boolean {
        if(itemName.length < capacity) {
            items.add(itemName)
        } else return
    }
    fun removeItem(itemName: String): Boolean {
        if(items.contains(itemName)) {
            items.remove(itemName)
        }
        return
    }
    fun canAccommodate(itemName: String) {
        if(itemName.length < capacity)
            return
    }
    fun containsItem(itemName: String): Boolean {
        if(items.contains(itemName))
            return
    }
    fun getItems() {
        println(items)
    }
}