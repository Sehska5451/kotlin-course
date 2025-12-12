package main.kotlin.lessons.lesson26

import java.io.File
import java.util.Properties

fun savePropertiesToFile() {
    val properties = Properties()

    properties.setProperty("name", "Андрей")
    properties.setProperty("age", "22")
    properties.setProperty("email", "Andrey_Pomosh_Bishkek@test.com")
    properties.setProperty("phone", "+995789456123")
    properties.setProperty("isActive", "true")

    val file = File("workspace/task5/config/config.txt")
    file.parentFile.mkdirs()
    properties.store(file.writer(), "Конфигурация пользователя")

    println("Данные сохранены в ${file.absolutePath}")
}


fun readPropertiesFromFile() {
    val properties = Properties()
    val file = File("workspace/task5/config/config.txt")
    file.parentFile.mkdirs()

    if (file.exists()) {
        properties.load(file.reader())
        println("Загруженные данные:")
        properties.forEach { (value) ->
            println("$value")
        }
    }
}

fun workspaceContent() {
    val something = File("workspace/task1/example.txt")
    if (!something.isDirectory || !something.exists()) {
        println("Директория не найдена")
        return
    }
    something.walk()
        .filter { it.isDirectory }
        .sorted()
        .forEach { println("${it.absolutePath}") }

    something.walk()
        .filter { it.isFile }
        .sorted()
        .forEach { println("${it.absolutePath}") }

}

fun checkFileExists(directory: String, filename: String): Boolean {
    val file = File(directory, filename)
    return file.exists() && file.isFile
}

fun main() {
//Задача 1
//
//Создайте текстовый файл workspace/task1/example.txt.
    // Запишите в него строку "Hello, Kotlin!", а затем проверьте, существует ли файл.
    // Реши задачу с использованием scope функции без создания переменной.
    val file = File("workspace/task1/example.txt").apply {
        parentFile.mkdirs()
        writeText("Hello, Kotlin!")
        if (exists()) {
            println("Файл существует")
        } else {
            println("Файл не найден")
        }
    }
    println(file)

//Задача 2
//
//Создайте директорию workspace/task2/testDir.
// Проверьте, является ли она директорией, и выведите её абсолютный путь.
    val directory = File("workspace/task2/testDir").apply {
        mkdirs()
        isDirectory
        absolutePath
    }
    println(directory)

//Задача 3
//
//Создайте директорию workspace/task3/structure.
// Внутри директории structure создайте папку myDir с двумя вложенными поддиректориями subDir1 и subDir2.
// Проверьте, что myDir действительно содержит эти поддиректории.
// Используй scope функции для минимизации создания переменных а так же метод file.resolve("myDir") для создания нового объекта File путём добавления к существующему пути ещё одной секции.
// И так же для других директорий.
    val directory1 = File("workspace/task3/structure").apply {
        mkdirs()
        resolve("workspace/task3/structure/myDir")
        resolve("workspace/task3/structure/myDir/subDir1")
        resolve("workspace/task3/structure/myDir/subDir2")
        absolutePath
    }
    println(directory1)


//Задача 4
//
//Создайте директорию workspace/task4/temp.
// Внутри директории temp создайте несколько вложенных файлов и директорий.
// Удалите директорию workspace/task4 со всем содержимым
    val directory2 = File("workspace/task4/temp").apply {
        mkdirs()
        resolve("workspace/task4/temp/test1/test2/test3")
        //delete()
    }
    println(directory2)


//Задача 5
//
//Создайте файл workspace/task5/config/config.txt.
// запишите в него список параметров (в формате ключ=значение), а затем прочитайте файл и выведите только значения.
    savePropertiesToFile()
    readPropertiesFromFile()

//Задача 6
//
//Пройди по всем вложенным директориям workspace и выведи в консоль сначала пути директорий, а потом пути файлов
    workspaceContent()
//Задача 7
//
//Создайте директорию workspace/task7/docs.
// Проверь, есть ли файл с именем readme.md.
// Если файла нет, создайте его и запишите текст "This is a README file.".
// Проверьте текст в файле.
    File("workspace/task7/docs").apply {
        parentFile.mkdirs()
        checkFileExists("workspace/task7/docs", "readme.md")
        if (!checkFileExists("workspace/task7/docs", "readme.md")) {
            createNewFile()
            writeText("This is a README file.")
            readText()
        }
        println(readText())
    }

//Задача 8
//
//Создайте файлы
//
//workspace/task8/data/1/4/prod/data14.mysql
//workspace/task8/data/2/3/prod/data23.mysql
//workspace/task8/data/5/2/prod/data52.mysql
//Создайте директорию workspace/task8/backup и скопируйте туда файлы из workspace/task8/data сохраняя структуру директорий.
// Для копирования используй метод copyTo.
// Для получения относительного пути начиная от data используй relativeTo от пути до файла, передавая в него путь до базовой директории (то-есть data).
// Полученный relative фрагмент можно присоединить к пути бэкапа через resolve и таким образом получить путь назначения копирования,
// например workspace/task8/backup/1/4/prod/data14.mysql сохраняя весь относительный путь.
//    val file1 = File("workspace/task8/data/1/4/prod/data14.mysql")
//    val file2 = File("workspace/task8/data/2/3/prod/data23.mysql")
//    val file3 = File("workspace/task8/data/5/2/prod/data52.mysql")
//    val directory8 = File("workspace/task8/backup")
//    file1.copyTo(directory8)
//    file2.copyTo(directory8)
//    file3.copyTo(directory8)
}