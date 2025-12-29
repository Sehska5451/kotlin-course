package main.kotlin.lessons.lesson29
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.google.gson.GsonBuilder

data class Address(
    val street: String,
    val city: String,
    val postalCode: Int
)
data class User(
    val id: Int,
    val name: String,
    val isActive: Boolean,
    val address: Address
)

data class UserWithAlias(
    @SerializedName("user_id") val id: Int,
    @SerializedName("full_name") val name: String,
    val isActive: Boolean
)
//
//fun main() {
//    val json = """{"user_id":2,"full_name":"John Watson","isActive":false}"""
//    val gson = Gson()
//    val user = gson.fromJson(json, UserWithAlias::class.java)
//    println("User with alias: $user")
//
////    val address = Address("Baker Street", "London", 221)
////    val user1 = User(1, "Sherlock Holmes", true, address)
////    val gson1 = Gson() // Создаём экземпляр Gson
////    val json = gson.toJson(user) // Сериализация объекта
////    println("JSON: $json")
////
////    val user1 = gson.fromJson(json, User::class.java) // Десериализация JSON в объект
////    println("User: $user")
//
//
//    val gson2 = GsonBuilder()
//        .setPrettyPrinting() // Для красивого форматирования JSON
//        .serializeNulls() // Включить null-поля в JSON
//        .create()
//    val user2 = User(3, "Mary Morstan", false, Address("Fleet Street", "London", 123))
//    val json = gson.toJson(user)
//    println("Pretty JSON:\n$json")
//
//
//}