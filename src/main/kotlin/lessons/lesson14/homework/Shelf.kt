package main.kotlin.lessons.lesson14.homework

//class Shelf(val capacity: Int) {
//    private val items = MutableList<String>()
//    fun addItem(itemName: String): Boolean {
//        if(canAccommodate(itemName)) {
//            items.add(itemName)
//            return true
//        } else return false
//    }
//    fun removeItem(itemName: String): Boolean {
//        if(items.contains(itemName)) {
//            items.remove(itemName)
//            return true
//        } else {
//        return false
//            }
//    }
//    fun canAccommodate(itemName: String): Boolean {
//        val space = items.sumOf { it.lenght }
//        if(itemName.length + space <= capacity) {
//            return true
//        } else {
//            return false
//        }
//    }
//    fun containsItem(itemName: String): Boolean {
//        if (items.contains(itemName)) {
//            return true
//        } else {
//            return false
//        }
//    }
//    fun getItems(): List<String> {
//        return items.toList()
//    }
//}