package main.kotlin.lessons.lesson18

interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getChargeLevel(): Double
    fun recharge()
}

abstract class Fridge:
    Powerable,
    Openable,
    TemperatureRegulatable,
    SoundEmitting,
    Programmable

abstract class WashingMachine:
        Powerable,
        Openable,
        TemperatureRegulatable,
        SoundEmitting,
        Programmable,
        Cleanable,
        LightEmitting,
        Drainable,
        AutomaticShutdown,
        WaterConnection

abstract class SmartLamp:
        Powerable,
        AutomaticShutdown,
        Timable,
        Programmable

abstract class ElectonicClocks:
        Powerable,
        Programmable,
        SoundEmitting,
        LightEmitting,
        BatteryOperated,
        Timable

abstract class RoboCleaner:
        Powerable,
        Programmable,
        Cleanable,
        SoundEmitting,
        Rechargeable,
        Movable,
        AutomaticShutdown,
        Openable

abstract class Flashlight:
        Powerable,
        LightEmitting,
        Rechargeable,
        AutomaticShutdown

abstract class CoffeeMachine:
        Powerable,
        Openable,
        WaterConnection,
        WaterContainer,
        TemperatureRegulatable,
        Drainable,
        Mechanical

abstract class SmartSpeaker:
        Rechargeable,
        SoundEmitting,
        AutomaticShutdown,
        Movable

//Задача 2. Создай абстрактный класс для включаемого оборудования и имплементируй соответствующий интерфейс с реализацией методов (достаточно println с выполняемым действием).
abstract class  PowerableMachine:
        Powerable {
    private var isPowered = false
    override fun powerOn() {
        if (!isPowered) {
            isPowered = true
            println("Device is powered on")
        }
    }
    override fun powerOff() {
        if (isPowered) {
            isPowered = false
            println("Device is powered off")
        }
    }
}

//Создай абстрактный класс для программируемого оборудования (с имплементацией соответствующего интерфейса и реализацией методов) и наследуй его от абстрактного класса включаемого оборудования.
abstract class ProgrammableDevice: PowerableMachine(), Programmable {
    private var currentPrograam: String? = null
    override fun programAction(action: String) {
        currentPrograam = action
        println("Program $action is installed")
    }

    override fun execute() {
        if(currentPrograam == null) {
            println("There is no installed programs")
        } else {
            println("Executing program: $currentPrograam")
        }
    }
}
//Создай абстрактный класс оборудования с возможностью устанавливать температуру и открываться и с наследованием от программируемого оборудования. Также имплементируй интерфейсы.
abstract class TempControlOpenableDevice(
    override val maxTemp: Int
) : ProgrammableDevice(), Openable, TemperatureRegulatable {
    private var isOpen = false
    private var currentTemp = 0

    override fun open() {
        if(!isOpen) {
            isOpen = true
            println("Opened")
        } else {
            println("Device is already opened")
        }
    }

    override fun close() {
        if (isOpen) {
            isOpen = false
            println("Closed")
        } else {
            println("Device is already closed")
        }
    }

    override fun setTemperature(temp: Int) {
        if(temp in 0..maxTemp) {
            currentTemp = temp
            println("Temperature is $temp")
        } else {
            println("Can't set such temperature as $temp")
        }
    }
}

