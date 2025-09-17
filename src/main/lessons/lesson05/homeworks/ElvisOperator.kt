package main.lessons.lesson05.homeworks

main () {

    // Задача 1
    var PrimarySoundintensity: Double = 10.0 // значение для примера
    var SoundAttenuationCoefficient: Double? = null
    var SoundIntensity = (SoundAttenuationCoefficient ?: 0.5) * PrimarySoundintensity
    println(SoundIntensity)

    // Задача 2
    var Price: Double? = null
    var InsuranceCoefficient = 0.005
    var FullDeliveryPrice = (Price ?: 50) + ((Price ?: 50) * InsuranceCoefficient)
    println(ItemDelivery)

    // Задача 3
    var AtmospherePressure: Int? = null
    val FinalData = AtmospherePressure ?: "Error"
    println(FinalData)

}