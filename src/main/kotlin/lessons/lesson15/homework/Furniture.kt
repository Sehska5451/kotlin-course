package main.kotlin.lessons.lesson15.homework

//Иерархия Мебели
//Базовый класс: Мебель
open class Furniture(val selfCost: Double)

//Производные классы: …
open class TypeOfFurniture(
    selfCost: Double,
    val type: String
) : Furniture(selfCost)

//Дополнительное разветвление для …: …
open class FurnitureMaterial(
    selfCost: Double,
    type: String,
    val material: String
) : TypeOfFurniture(selfCost, type)

abstract class Materials {
    private val materials = mutableListOf<String>()
    fun addMaterial(material: String) {
        materials.add(material)
    }
    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }
    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

//Первый класс должен вставлять строку на дно контейнера (должно появиться под индексом 0)
class takeFirstMaterial: Materials() {
    fun take(item: String) {
        val materials = extractMaterials()
        addMaterial(item)
        materials.forEach {
            addMaterial(it)
        }
    }
}

//Второй класс должен получать список строк и вставлять их в начало контейнера но поочерёдно с теми данными, которые уже есть. То-есть, наш список должен появиться в контейнере по индексам 0, 2, 4 и так далее.
//class InsertOneByOneMaterials : Materials() {
//
//    fun insert(items: List<String>) {
//        val materials = extractMaterials()
//        val maxIndex = max(items.lastIndex, materials.lastIndex)
//        for (i in 0..maxIndex) {
//            if (i < items.size) {
//                addMaterial(items[i])
//            }
//            if (i < materials.size) {
//                addMaterial(materials[i])
//            }
//        }
//    }
//}
//Третий класс при добавлении строки должен отсортировать весь список метиралов в алфавитном порядке включая добавляемый материал.
class InsertSortedMaterials : Materials() {

    fun insert(item: String) {
        val materials = (extractMaterials() + item).sorted()
        materials.forEach {
            addMaterial(it)
        }
    }
}

//Четвёртый класс должен принимать словарь (ключи и значения строки).
// Каждая пара ключа и значения должна попадать в контейнер следующим образом - ключ в начало, значение в конец.
// Таким образом в начале должны быть ключи в обратном порядке, потом существующие материалы, потом все значения.
class InsertMapMaterials : Materials() {

    fun insert(items: Map<String, String>) {
        val materials = items.keys.reversed() + extractMaterials() + items.values
        materials.forEach {
            addMaterial(it)
        }
    }
}
