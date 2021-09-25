package basic

interface A {
    fun a()
    fun b()
    fun notAbstractFuncA() = println("A: not abstract function")
}

open class SuperClass : A {
    override fun a() = println("superclass a")

    override fun b() = println("superclass b")
}

class AClass : SuperClass(), A {
    override fun a() = println("AClass a")
//    override fun b() = println("AClass b")
}

fun main() {
    val aClass = AClass().also {
        it.a()
        it.b()
        it.notAbstractFuncA()
    }
}