package basic

fun main() {
    val str1 = "s"
    val str2 = String(str1.toByteArray())
    println(str1 == str2)
    println(str1 === str2)
}


