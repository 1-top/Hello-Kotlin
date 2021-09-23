package basic

fun main() {
    immutableListTest()
    mutableListTest()
}

fun immutableListTest() {
    val list1 = listOf(1, 2, 3, 4) // read-only
    // list1[0] = 10 -> error
    println(list1[0])
    println(list1.get(0))
}

fun mutableListTest() {
    val list = mutableListOf(1, 2, 3, 4)
    list[0] = 10
    list.add(10)
    val last = list.map { item -> item * 2 }.last()
    println(last)
}