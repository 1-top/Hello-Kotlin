package basic

fun main() {
    nonSkipUnit()
    println(returnStr())
    println(ifFunc(2, 1))
    println(whenFunc(31))
}

fun nonSkipUnit(): Unit = println("Hello World")

fun returnStr(): String = "Hello Return"

fun ifFunc(a: Int, b: Int) = if (a > b) a else b

fun whenFunc(score: Int) = when (score) {
    in 11..20 -> "11 ~ 20"
    in 21..30 -> "21 ~ 30"
    31 -> "31"
    else -> "else score" // 반드시 else 있어야한다.
}