package basic

import basic.Expr.Num
import basic.Expr.Sum

sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun myEval(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> myEval(e.left) + myEval(e.right)
}

fun main() {
    // (1 + 2) + 3
    val onePlusTwo = Sum(Num(1), Num(2))
    val three = Num(3)
    val expr = Sum(onePlusTwo, three)
    myEval(expr).also(::println)
}