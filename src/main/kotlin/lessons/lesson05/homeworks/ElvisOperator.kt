package main.kotlin.lessons.lesson05.homeworks

fun main () {

    // Задача 1
    var PrimarySoundintensity: Double = 10.0 // значение для примера
    var SoundAttenuationCoefficient: Double? = null
    var SoundIntensity = (SoundAttenuationCoefficient ?: 0.5) * PrimarySoundintensity
    println(SoundIntensity)

    // Задача 2
    var Price: Double? = 100.00
    var DeliveryCost: Double = 120.00
    var InsuranceCoefficient = 0.005
    var InsuarenceCost = ((Price ?: 50.00) * InsuranceCoefficient)
    var FullDeliveryCost = DeliveryCost + InsuarenceCost
    println(FullDeliveryCost)

    // Задача 3
    var AtmospherePressure: Int? = null
    val FinalData = AtmospherePressure ?: "Error"
    println(FinalData)

}