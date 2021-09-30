package basic

fun main() {
    for (i in 1..10) print("$i ")
    println("\n--------------------------")
    for (i in 1 until 10) print("$i ")
    println("\n--------------------------")
    for (i in 10 downTo 1) print("$i ")
    println("\n--------------------------")
    for (i in 1..10 step 2) print("$i ")
    println("\n--------------------------")
    for (i in 10 downTo 1 step 2) print("$i ")
}