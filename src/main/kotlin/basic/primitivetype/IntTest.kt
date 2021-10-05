package basic.primitivetype

fun main() {
    with(Int) {
        println(MAX_VALUE)
        println(MIN_VALUE)
        println(SIZE_BITS)
        println(SIZE_BYTES)
    }

    println(10.coerceIn(0, 100))
    println(123.coerceIn(0, 100))
    println(10.coerceAtLeast(5)) // 지정 수의 최소 숫자를 보장해준다. 지정 수보다 작으면 minimumValue를 반환한다.
    println(10.coerceAtMost(5)) // 최대 수를 보장해준다. maximumValue보다 크다면 maximumValue를 반환한다.
}
