package main.kotlin.lessons.lesson14.homework

//class Rack(val maxShelvesCount: Int) {
//    private val shelves = mutableListOf<Shelf>()
//    fun addShelf(newShelf: Shelf): Boolean {
//        if(shelves.size < maxShelvesCount && !shelves.contains(newShelf)) {
//            shelves.add(newShelf)
//            return true
//        } else {
//            return false
//        }
//
//    }
//    fun removeShelf(index: Int): List<String> {
//        if(index in shelves.indices) {
//            val bag = shelves[index].getItems()
//            shelves.removeAt(index)
//            return bag
//        } else {
//            return listOf()
//        }
//    }
//
//    fun addItem(itemName: String): Boolean {
//        for(shelf in shelves) {
//            if(shelf.canAccommodate(itemName)){
//                shelf.addItem(itemName)
//                return true
//            }
//        }
//        return false
//    }
//
//    fun removeItem(itemName: String): Boolean {
//        for(shelf in shelves) {
//           if(shelf.containsItem(itemName))
//               shelf.removeItem(itemName)
//                return true
//        }
//        return false
//    }
//
//    fun containsItem(itemName: String): Boolean {
//        for(shelf in shelves) {
//            if (shelf.containsItem(itemName))
//                return true
//        }
//        return false
//    }
//    fun getShelves(): List<Shelf> {
//        return shelves.toList()
//    }
//
//    fun printContents(): Any {
//        println("Shelves info:")
//        shelves.forEach { index, shelf ->
//            val usedSpace = shelf.getItems().sumOf { it.length }
//            val reaminCapacity = shelf.capacity - usedSpace
//
//            println("Shelf number: $index")
//            println("Capacity: ${shelf.capacity}")
//            println("Space remaining: $reaminCapacity")
//            println("Items - ${shelf.getItems().joinToString(", ")}")
//        }
//    }
//    fun advancedRemoveShelf() {
//
//    }
//}