package main.kotlin.lessons.lesson26

import java.io.File

fun ex1(path: String) {
    val file = File(path)
    if (path.endsWith("/")) {
      file.mkdirs()
    } else {
        file.parentFile?.mkdirs()
        file.createNewFile()
    }
}

fun ex2(path: String, arg: Map<String, Double>) {
    val file = File(path)
    file.parentFile?.mkdirs()
    file.createNewFile()
    arg.map { {"${it.key}=${it.value}"} }
        .joinToString("\n")
        .also { file.writeText(it) }
}

fun ex3(path: String, key: String) {
     File(path).apply {
         if(readText().contains(key) && exists()) {
             delete()
             }
     }
}

fun ex4(path: String, key: String): List<String> {
    return File(path).walk()
        .filter { it.name.contains(key) && it.isFile }
        .map { it.readText() }
        .toList()
}

fun String.ex5(path: String) {
    File(this).run {
        check(exists()) {
            "File doesn't exist"
        }

    }
}