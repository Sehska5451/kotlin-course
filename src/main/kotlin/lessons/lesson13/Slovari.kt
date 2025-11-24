package main.kotlin.lessons.lesson13

fun main () {

    val fruitPrices = mapOf("apple" to 0.3, "banana" to 2.99, "melon" to 3.99)

    for (entry in fruitPrices) {
        println("Key ${entry.key}, Value: ${entry.value}")
    }

    for((key, value) in fruitPrices) {
        println("Key: $key, Value: $value")
    }

    val entries = fruitPrices.entries
    val keys = fruitPrices.keys
    val values = fruitPrices.values
    println(entries)
    println(keys)
    println(values)

    val entries: Set<Map, Map.Entry<String, Double>> = fruitPrices.entries
    val keys: Set<String> = fruitPrices.keys
    val values: Collection<Double> = fruitPrices.values
    println(entries)
    println(keys)
    println(values)

    val priceOfPearOrElse = fruitPrices.getOrElse("pear") { 9999.9 }
    val priceOfApple = fruitPrices.getValue("apple")
    val priceOfPearOrDefault = fruitPrices.getOrDefault("pear", 0.0)

    val fruitWithoutBanana = fruitPrices - "banana" //создание словаря без ключа банан
    val fruitWithPineapple = fruitPrices + ("pineapple" to 3.5)
    val mutableFruit = fruitPrices.toMutableMap()// создание изменяемого словаря
    mutableFruit["kiwi"] = 2.7
    mutableFruit.putAll(mapOf("lime" to 2.2, "avocado" to 4.2))
    mutableFruit + mapOf("lime" to 2.2, "avocado" to 4.2)
    mutableFruit.remove("apple")
    mutableFruit.clear()

    val containsKey = fruitPrices.containsKey("apple")
    val containsValue = fruitPrices.containsValue(2.2)
    val isEmpty = fruitPrices.isEmpty()
    val isNotEmpty = fruitPrices.isNotEmpty()
    val areAllFruitExpensive = fruitPrices.all { it.value > 1.0 }
    val isAnyFruitCheap = fruitPrices.any { it.value < 1.0 }

    val filteredByPrice = fruitPrices.filter { it.value > 1.0 }
    val filteredByKeys = fruitPrices.filterKeys { it.startsWith("a") }
    val filteredByValue = fruitPrices.filterValues { it < 2.0 }
    val filteredNotApple = fruitPrices.filterNot { it.value == "apple" }
    val countExpensiveFriut = fruitPrices.count()

    val increasedPrices = fruitPrices.mapValues { "${it.value * 1.1}" }
    val fruitNameUppercase = fruitPrices.mapKeys { it.key.uppercase() }
    val fruitList = fruitPrices.map { "${it.key} costs ${it.value}" }// преобразует словарь в список

    val toMap = mutableFruit.toMap()
    val toMutableMap = fruitPrices.toMutableMap()

    fruitPrices.forEach { fruit, price ->
        println("$fruit costs $price")
    }


    fruitPrices.size
    fruitPrices.count()
    fruitPrices.count { it.value > 2 }






}