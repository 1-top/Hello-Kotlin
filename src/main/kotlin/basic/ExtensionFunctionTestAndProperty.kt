package basic

open class MyClass

class MySubClass : MyClass()

fun MyClass.hello() = "Hello Extension Function"

fun MySubClass.hello() = "Hello SubClass"

val MySubClass.hi: String
    get() = "Hi I'm extension property"

fun main() {
    val also: MyClass = MySubClass().also { println(it.hello()) }
    also.hello().also(::println) // Extension Function은 Override가 안된다.
    MySubClass().also { println(it.hi) }
}