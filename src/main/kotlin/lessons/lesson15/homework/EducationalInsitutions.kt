package main.kotlin.lessons.lesson15.homework

//Учебные Заведения
//Базовый класс: Учебное Заведение
open class EducationalInsitutions(val name: String)

//Базовый класс: Учебное Заведение
open class TypeOfInstitution(
    name: String,
    val type: String
) : EducationalInsitutions(name)

//Дополнительное разветвление для …: …
open class ageOfStudents(
    name: String,
    type: String,
    val age: Int
) : TypeOfInstitution(name, type)
