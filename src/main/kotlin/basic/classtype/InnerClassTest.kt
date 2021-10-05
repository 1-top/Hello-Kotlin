package basic.classtype

class AClazz {
    class BClazz(val b: String)
    inner class CClazz(val c: String)
}

fun main() {
    AClazz.BClazz("B").b.also(::println)
    AClazz().CClazz("C").c.also(::println)
}