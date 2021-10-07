package basic

fun main() {
    simpleGeneric(null)
//    notNullGeneric(null) // null 불가!

    numSum(1, 2).also(::println)
    numSum(1L, 2L).also(::println)
    numSum(1.0, 2.0).also(::println)

    max("a", "b").also(::println)
}

// generic에 아무런 상한을 지정하지 않으면 Any? 과 같다. 따라서 null 또한 들어갈 수 있다.
fun <T> simpleGeneric(t: T) = println(t?.hashCode()?:"t is null")

// 만약 generic에 널이 아니지만 아무 타입이나 가능하다면 Any를 상한으로 지정하자.
fun <T:Any> notNullGeneric(t:T) = println(t.hashCode())

// <T extends Number>
fun <T : Number> numSum(n1: T, n2: T) = when {
    n1 is Int && n2 is Int -> n1 + n2
    n1 is Long && n2 is Long -> n1 + n2
    n1 is Double && n2 is Double -> n1 + n2
    else -> throw IllegalArgumentException("")
}

fun <T : Comparable<T>> max(c1: T, c2: T) = if (c1 > c2) c1 else c2

fun listSum(t: Collection<Int>) = if (t is List<Int>) t.sum() else throw IllegalArgumentException("")