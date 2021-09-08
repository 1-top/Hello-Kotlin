package tutorial

fun main() {
    val a = intArrayOf(1, 2, 3, 4, 5)
    for (i in a) print("$i ")
    println()
//    a.forEach { i -> print("$i ") }
    println("-----------------------------------")
    a.forEach(::print)
    println()
    a.forEach { print("$it ") } // it 으로 i -> 를 생략할 수도 있구나!
    println()
    println("-----------------------------------")
    println("step")
    for (i in 0..10 step 2) print("$i ") // step이라는 것도 있구나. 0 ~ 10

    println("\nuntil")
    for (i in 0 until 9) print("$i ") // until이라는 것도 있구나. 0 ~ 8까지 감. 9는 X

    println("\ndownTo")
    for (i in 10 downTo 0) print("$i ") // 10 ~ 0

    println("\ndownTo with step")
    for (i in 10 downTo 0 step 2) print("$i ") // 10 8 6 4 2 0

    val list = listOf("H", "e", "l", "l", "o")
    println("\nwithIndex")
    for ((index, value) in list.withIndex()) {
        println("$index: $value")
    }

    println("forEachIndexed")
    list.forEachIndexed { index, value -> println("$index: $value") }

    // while
    println("while")
    var i = 0
    while (true) {
        if (i < 5) i++
        else break
    }
    println("i: $i")

}