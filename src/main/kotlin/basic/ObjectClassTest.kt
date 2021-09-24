package basic

import java.util.*

// Singleton Pattern class
object CarFactory {
    val cars = mutableListOf<Car>()

    fun findById(id: String) = this.cars.find { it.id == id }

    fun findByName(name: String) = this.cars.filter { it.name == name }
}

data class Car(val name: String) {
    val id = UUID.randomUUID().toString()
}

fun main() {
    val car1 = Car("car1")
    println(car1.id)
    CarFactory.cars.addAll(listOf(car1, Car("car1")))
    println(CarFactory.findById(car1.id))
    println(CarFactory.findByName(car1.name))
}