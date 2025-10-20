package main.kotlin.lessons.lesson13

fun main() {
//1 Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
    val time = mapOf<String, Int>("test11" to 10, "test12" to 20, "test13" to 30, "test14" to 40в)
    val avgTime = time.values.average()
    println("Среднее время выполнения теста: $avgTime")

//2 Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными. Выведите список всех тестовых методов.
    val testMeta = mapOf<String, String>("method1" to "metadata1", "method2" to "metadata2", "method3" to "metadata3", "method4" to "metadata4")
    val methods = testMeta.keys
    println(methods)

//3 В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val testResults = mutableMapOf<String, String>("test1" to "passed", "test2" to "skipped", "test3" to "failed", "test4" to "passed", "test5" to "failed")
    testResults["test6"] = "passed"
    println(testResults)

//4 Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
    val countRes = testResults.count {it.value == "passed"}
    println(countRes)

//5 Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления).
    val bugTrack = mutableMapOf<String, String>("bug1" to "fixed", "bug2" to "fixed", "bug3" to "todo")
    bugTrack.remove("bug1")

//6 Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
    val urlTest = mapOf<String, String>("url1" to "in progress", "url2" to "done", "url3" to "failure", "url4" to "in progress")
    urlTest.forEach {
        println("Проверка страницы ${it.key} находится в статусе ${it.value}")
    }

//7 Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val serviceTime = mapOf<String, Int>("service1" to 12, "service2" to 10, "service3" to 44, "service4" to 45)
    val avgServTime = serviceTime.filterValues{ it > 30}
    println(avgServTime)

//8 В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки). Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val apiTest = mapOf<String, String>("endpoint1" to "200", "endpoint2" to "200", "endpoint3" to "503", "endpoint4" to "404")
    val res8 = apiTest["endpoint4"] ?: "Не протестирован"
    val res81 = apiTest["endpoint5"] ?: "Не протестирован"
    println(res8)
    println(res81)

//9 Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение - сама конфигурация), получите значение для "browserType". Ответ не может быть null.
    val configEnv = mapOf<String, String>("browserType" to "Chrome", "stand" to "dev", "BD" to "mongo")
    val res9 = configEnv.getValue("browserType")
    println(res9)

//10 Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val testVer = mapOf<String, String>("ver1" to "testing", "ver2" to "done", "ver3" to "reopen", "ver4" to "in progress")
    val testVer2 = testVer + ("ver5" to "done")
    println(testVer2)

//11 Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства, значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.
    val mobTest = mapOf<String, String>("redmi note 1" to "test,test", "nokia e62" to "test,test", "iphone 16" to "test,test", "pixel 5" to "test,test")
    val res11 = mobTest.getOrDefault("redmi note 1", "iphone 16")
    println(res11)

//12 Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
    val errorMap = mapOf("ERR001" to "Null pointer exception", "ERR002" to "Timeout error", "ERR003" to "Invalid input")
    val res12 = errorMap.containsKey("ERR002")
    println(res12)

//13 Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов, то-есть в ключе содержится требуемая версия.
    val testRes13 = mapOf("Test01_v1" to "Passed", "Test02_v2" to "Failed", "Test03_v1" to "Skipped", "Test04_v3" to "Passed", "Test05_v2" to "Failed")
    val filterRes = testRes13.filterKeys{it.contains("_v2")}
    println(filterRes)

//14 У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    val funcModule = mapOf("api" to "Passed", "mail" to "Failed", "auth" to "Skipped", "orders" to "Passed", "searh" to "Failed")
    val funcFilterRes14 = funcModule.filter { it.value == "Failed" }
    println(funcFilterRes14)