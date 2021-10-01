package collections

/**
 * public infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)
 * to 는 Pair를 반환하는 중위 함수(infix)이다.
 */

fun main() {
    val map = mapOf(1 to "one", Pair(2, "two"), 3.to("three")) // mapOf가 인자로 Pair를 받고 있다.
    map.forEach {(i, str) -> println("$i $str")}
}