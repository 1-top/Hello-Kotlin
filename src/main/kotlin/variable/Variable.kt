package variable

/**
 * val: Value (constant)
 * var: Variable (non-constant)
 */

var num = 10
var hello = "hello"

val fix = 3.14 // final 이랑 같은 거 같음!

//fun main(args:Array<String>) {
fun main() { // args 지워도 됨!
    println(num)
    num += 10
    println(num) // 20
    println(hello)
    println(fix)
//    fix = 5 // exception: Val cannot be resigned
//    println(fix)
}