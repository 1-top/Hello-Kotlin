package basic.classtype

//open class Human constructor(val name: String = "Anonymous") {
open class Human(val name: String = "Anonymous") { // primary constructor에서 constructor 키워드는 생략이 가능하다!
// 단 private constructor에서 constructor 키워드는 생략이 불가능하다.

    init {
        println("$name Human has been born.")
    }

    // Secondary constructor에는 val 또는 var를 사용할 수 없다!
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