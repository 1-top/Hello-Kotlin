package basic

fun main() {
    arrayTest()
}

fun arrayTest() {
    val array = arrayOf(1, 2, 3, 4)
    println("${array[0]} ${array[1]}")
    array.forEach { item -> println("$item * 2 = ${item * 2}") }
    val size = array.size
    println(size)
    array[0] = 10 // 내부 값 변경 가능
}
