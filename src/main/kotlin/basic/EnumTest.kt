package basic

import basic.Color.* // import 를 통해 코드를 더 간결하게 만들 수 있다.

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0), BLUE(0, 0, 255),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main() {
    ORANGE.rgb().also { println(it) }
    getMnemonic(BLUE).also { println(it) }
    getWarm(BLUE).also { println(it) }
    mixColor(YELLOW, RED).also { println(it) }
}

fun getMnemonic(color: Color) = when (color) {
    RED -> "Richard"
    ORANGE -> "Of"
    YELLOW -> "York"
    GREEN -> "Gave"
    BLUE -> "Battle"
    INDIGO -> "In"
    VIOLET -> "Vain"
}

fun getWarm(color: Color) = when (color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "natural"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun mixColor(c1: Color, c2: Color) = when (setOf(c1, c2)) {
    setOf(RED, YELLOW) -> "ORANGE"
    setOf(YELLOW, BLUE) -> "GREEN"
    setOf(BLUE, VIOLET) -> "INDIGO"
    else -> throw RuntimeException("Dirty color")
}