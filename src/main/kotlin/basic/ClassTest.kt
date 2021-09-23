package basic

open class Human constructor(val name: String = "Anonymous") {

    init {
        println("$name Human has been born.")
    }

    constructor(name: String, age: Int) : this(name) {
        println("My name is $name and $age years old.")
    }

    fun eat() {
        println("$name is eating")
    }

    open fun sing() {
        println("Human sing")
    }
}

class Korean(name: String = "anonymousKorean") : Human(name) {

    override fun sing() {
        println("$name Korean sing")
    }
}

fun main() {
    val human = Human("human1", 10)
    val anonymousHuman = Human()
    println(human.name)
    println(anonymousHuman.name)

    println("------------------------")
    val anonymousKorean = Korean()
    anonymousKorean.sing()
    val korean = Korean("Korean1")
    korean.sing()
}