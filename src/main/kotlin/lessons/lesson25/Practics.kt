package main.kotlin.lessons.lesson25

fun ex1(): Int {
    val a1 = listOf(1, 2, 3)
    val result = a1.sum()
    println(result)
    return result
}

fun ex11(): Int {
    return listOf(1, 2, 3, 4, 5).sum()
        .apply{ println(this) }
}

fun ex12(): Int {
    return listOf(1, 2, 34, 5, 6).sum()
        .also {
        println(it)
    }
}

fun ex2(): Int {
    val arg1 = mutableListOf(1, 2, 34, 45, 5,6)
    arg1.add(12)
    arg1.add(23)
    arg1.add(22)
    println(arg1.size)
    return arg1.sum()
}

fun ex21(): Int {
    return with(mutableListOf(1, 2, 3, 4, 5)) {
        add(22)
        add(3)
        add(2)
        println(size)
        sum()
    }
}

fun ex22(): Int {
    return mutableListOf(1, 2, 3, 4).run {
        add(12)
        add(13)
        add(14)
        size
        sum()
    }
}

//fun ex3(arg: List<String>?): Int {
//    if (arg == null) {
//        println("Empty list")
//        return 0
//    } else {
//        val lngth = arg.map { it.length }
//        println(lngth.sum())
//        return lngth.sum()
//    }
//}

//fun ex31(arg: List<String>?): Int {
//    return (arg?.let { it.lenght } ?: 0)
//        .also {(println(it))
//}