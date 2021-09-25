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
    val car1 = Car("car1").also { println(it.id) }
    CarFactory.cars.run {
        this.addAll(listOf(car1, Car("car1")))
        CarFactory.findById(car1.id).also { println(it) }
        CarFactory.findByName(car1.name).also { println(it) }
    }
}