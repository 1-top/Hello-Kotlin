package tutorial

// if expression
fun big(num1: Int, num2: Int): Int {
//    val a = if (num1 > num2) num1 // 이렇게도 값을 할당할 수 있네..?!
//    else num2
//    return a;
//    return (num1 > num2) ? num1 : num2 // Kotlin은 삼항연산자가 없다!
    return if (num1 > num2) num1 else num2; // return에 if문을 걸 수도 있다.
}

fun printIfIn(num: Int) {
    if (num in 1..4) println("$num is in the range 1 to 4")
}

// when expression
fun printWhen(num: Int): Unit { // switch 문하고 비슷한 거 같다. break 문 없어도 된다.
    when (num) {
        1 -> println("$num == 1")
        2 -> println("$num == 2")
        3, 4 -> println("this is 3 or 4")
        else -> println("num is not 1, 2, 3, 4")
    }
}

fun printWhen(num: Long) {
    when (num) {
        1L, 2L -> println("$num is 1 or 2") // 쉼표(,)로도 사용이 가능하네
        else -> println("num is not 1 or 2")
    }
}

fun printWhenRange(num: Int) {
    when (num) {
        in 1..10 -> println("$num is in the range 1 to 10")
        !in 1..10 -> println("$num is not in the range 1 to 10")
    }
}

fun isStartsWith(str: Any, pre: String) = when (str) { // 이렇게도 바로 되네, 이게 가능한 이유가 smart casts 때문이라는 거 같다.
    is String -> str.startsWith(pre)
    else -> false
}

fun main() {
    println(big(10, 20)) // 20
    printIfIn(3) // 3 is in the range 1 to 4
    printWhen(1) // 1 == 1
    printWhen(2) // 2 == 2
    printWhen(3) // this is 3 or 4
    printWhen(5) // num is not 1, 2, 3, 4
    printWhenRange(21) // 21 is not in the range 1 to 10
    println(isStartsWith("HelloWorld", "Hello")) // true
}