package main.kotlin.lessons.lesson17

//open class SlotMachine {
//
//    var color: String
//    val model: String
//    var isOn: Boolean
//    var loadedOS: Boolean
////    val loadedGames
//    var joystick: Boolean
//    var balance: Double
//    var owner: String
//    var techSuppNumber: String
//    var isUsingPaid: Boolean
//    val oneUsingPrice: Int
//    var pinCode: String
//
//    constructor(
//        color: String,
//        model: String,
//        isOn: Boolean,
//        loadedOS: Boolean,
//        loadedGames: = mutableListOf<String>(),
//        joystick: Boolean,
//        balance: Double,
//        owner: String,
//        techSuppNumber: String,
//        isUsingPaid: Boolean,
//        oneUsingPrice: Int,
//        pinCode: String
//    ) {
//        this.color = color
//        this.model = model
//        this.isOn = isOn
//        this.loadedOS = loadedOS
////        this.loadedGames = loadedGames
//        this.joystick = joystick
//        this.balance = balance
//        this.owner = owner
//        this.techSuppNumber = techSuppNumber
//        this.isUsingPaid = isUsingPaid
//        this.oneUsingPrice = oneUsingPrice
//        this.pinCode = pinCode
//    }
//
//    fun turnOn() {
//        if(isOn == true) {
//            println("$model turned on")
//        } else {
//            isOn = true
//            println("$model is turning on")
//        }
//    }
//
//    fun turnOff() {
//        if(isOn == true) {
//            isOn = false
//        } else {
//            println("$model is turned off")
//        }
//    }
//
//    fun loadOS() {
//        if(loadedOS == true) {
//            println("There is OS on this device")
//        } else {
//            loadedOS = true
//            println("Downloading OS")
//        }
//    }
//
//    fun turnOffOS() {
//        turnOff()
//    }
//
//    fun showListOfGames() {
//        println(loadedGames)
//    }
//
//    fun playTheGame(pin: String) {
//        if(balance >= oneUsingPrice && pin == pinCode) {
//            turnOn()
//        }
//    }
//
//    fun payForGame(pin: String) {
//        if(pin == pinCode && isUsingPaid == false) {
//            println("Give me your money")
//        }
//    }
//
//    fun refund(pin: String) {
//        if(isUsingPaid == true && pin == pinCode && balance >= oneUsingPrice) {
//            println("You can refund your money")
//        }
//    }
//}
//
//abstract class BaseClass(
//    // 1. объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
//    // Потому что является наследованием из родительского класса
//    private val privateVal: String,
//    // 2. объясни, почему это поле недоступно в main()
//    // Потому что это защищенная переменная
//    protected val protectedVal: String,
//    val publicVal: String
//) {
//    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
//            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
//        set(value) {
//            if (verifyPublicField(value)) {
//                field = value
//            }
//        }
//    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"
//    private var privateField = "6. добавь сеттер чтобы изменить меня из main()"
//    fun getAll(): String {
//        return mapOf(
//            "privateVal" to privateVal,
//            "protectedVal" to protectedVal,
//            "publicVal" to publicVal,
//            "publicField" to publicField,
//            "protectedField" to protectedField,
//            "privateField" to privateField,
//            "generate" to generate(),
//        ).map { "${it.key}: ${it.value}" }
//            .joinToString("\n")
//    }
//    fun printText() {
//        privatePrint()
//    }
//    // 7. объясни, почему эта функция не может быть публичной
//    // Потому что эта функция наследуется из защищенного класса
//    protected open fun getProtectedClass() = ProtectedClass()
//    protected open fun verifyPublicField(value: String): Boolean {
//        return value.length < 3
//    }
//    // 8. Распечатай getAll() и объясни, почему в поле "generate" другой текст
//    open fun generate(): String {
//        return "Это генерация из родительского класса"
//    }
//    private fun privatePrint() {
//        println("Печать из класса BaseClass")
//    }
//    // 9. объясни, почему эта функция не может быть публичной или protected
//    // Потому что она наследуется из приватного класса
//    private fun getPrivateClass() = PrivateClass()
//
//    protected class ProtectedClass() {}
//
//    private class PrivateClass() {}
//}
//class ChildrenClass(
//    val privateVal: String,
//    protectedVal: String,
//    // 10. объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
//    publicVal: String
//) : BaseClass(privateVal, protectedVal, publicVal) {
//    // 11. объясни, почему в main() доступна функция getAll() хотя её здесь нет
//    // 12. проверь, что выводится на печать при вызове функции printText()
//    // и объясни, почему не происходит переопределение метода privatePrint()
//    private fun privatePrint() {
//        println("Печать из класса ChildrenClass")
//    }
//    override fun generate(): String {
//        return "Это генерация из дочернего класса"
//    }
//}