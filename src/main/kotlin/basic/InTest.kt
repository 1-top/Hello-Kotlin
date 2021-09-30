package basic

fun main() {
    isLetter('1').also { println(it) }
    isNotDigit('1').also { println(it) }
    recognize('a').also { println(it) }
}

fun isLetter(c: Char) = c in 'a'..'z'

fun isNotDigit(c: Char) = c !in '1'..'z'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter"
    else -> "something..."
}