package main.kotlin.lessons.lesson29
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.google.gson.GsonBuilder
import java.io.File

data class University(
    val name: String,
    @SerializedName("established_year") val establishedYear: Int,
    val faculties: List<Faculty>
)
data class Faculty(
    val name: String,
    val dean: String,
    @SerializedName("launch_year") val launchYear: Int,
    val students: List<Student>
)
enum class Gender {
    FEMALE,
    MALE
}
data class Student(
    @SerializedName("first_name") val firstName: String,
    @SerializedName("last_name") val lastName: String,
    val age: Int,
    val gender: Gender,
)

fun ex2() {
    val gson = GsonBuilder().setPrettyPrinting().create()
    val student1 = Student("John", "Doe", 20, Gender.MALE)
    val student2 = Student("Jane", "Doe", 19, Gender.FEMALE)
    val faculty = Faculty("Engineering", "Dr. Smith", 1965, listOf(student1, student2))
    val university = University("Tech University", 1905, listOf(faculty))
    gson.toJson(university).also {
        File("university.json").writeText(it)
    }
}

fun ex3() {
    val gson = Gson()
    val json = File("university.json").readText()
    gson.fromJson(json, University::class.java)
        .faculties
        .flatMap { it.students }
        .joinToString("\n")
        .also { println(it) }
}