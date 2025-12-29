package main.kotlin.lessons.lesson18

//interface Powerable {
//    fun turnOn()
//    fun turnOff()
//}
//
//interface Openable {
//    fun open()
//    fun close()
//}
//interface WaterContainer {
//    val capacity: Int
//    fun fillWater(amount: Int)
//    fun getWater(amount: Int)
//}
//interface TemperatureRegulatable {
//    val maxTemperature: Int
//    fun setTemperature(temp: Int)
//}
//interface WaterConnection {
//    fun connectToWaterSupply()
//    fun getWater(amount: Int)
//}
//interface AutomaticShutdown {
//    val sensorType: String
//    val maxSensoredValue: Int
//    fun startMonitoring()
//}
//interface Drainable {
//    fun connectToDrain()
//    fun drain()
//}
//interface Timable {
//    fun setTimer(time: Int)
//}
//interface BatteryOperated {
//    fun getCapacity(): Double
//    fun replaceBattery()
//}
//interface Mechanical {
//    fun performMechanicalAction()
//}
//interface LightEmitting {
//    fun emitLight()
//    fun completeLiteEmission()
//}
//interface SoundEmitting {
//    fun setVolume(volume: Int)
//    fun mute()
//    fun playSound(stream: InputStream)
//}
//interface Programmable {
//    fun programAction(action: String)
//    fun execute()
//}
//interface Movable {
//    fun move(direction: String, distance: Int)
//}
//interface Cleanable {
//    fun clean()
//}
//interface Rechargeable {
//    fun getCapacity(): Double
//    fun recharge()
//}
//abstract class Teapot:
//        Powerable,
//        Openable,
//        WaterContainer,
//        TemperatureRegulatable,
//        WaterConnection,
//        AutomaticShutdown
//
//abstract class VacuumCleaner: Powerable, Cleanable
//
//abstract class PortableKolonka: Powerable, SoundEmitting, Rechargeable
//
//abstract class Oven: Powerable, TemperatureRegulatable, LightEmitting, Openable, Timable
//
//fun closeObject(list: List<Openable>) {
//    for (i in list) {
//        i.close()
//    }
//}