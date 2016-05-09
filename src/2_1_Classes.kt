/**
 *
 */

/** This is how we do singletons */
object SomeSingleton {
    fun add(x: Int, y: Int) = x+y
}

/** This is how we do enums */
sealed class Vehicle {
    class Car(val make: String) : Vehicle()
    class Motorcycle(val capacity: Int) : Vehicle()
    object NotAVehicle : Vehicle()
}

fun main(args: Array<String>) {
    SomeSingleton.add(1, 2)

    fun eval(v: Vehicle): Unit = when(v) {
        is Vehicle.Car -> print("I'm a ${v.make}")
        is Vehicle.Motorcycle -> print("I'm a ${v.capacity}cc bike")
        Vehicle.NotAVehicle -> print("Not a vehicle")
    }
}
