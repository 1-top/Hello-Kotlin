package tutorial

/**
 * val: Value (constant)
 * var: Variable (non-constant)
 * semi-colon(;)을 안 적어도 된다..?!
 */

// Class 안에 없어도 선언 가능하고, 인스턴스화 하지 않아도 호출이 가능하네?!
var num = 10
var hello = "hello"

val fix = 3.14 // final 이랑 같은 거 같음!

//fun main(args:Array<String>) {
fun main() { // args 지워도 됨!
    println(num) // 인스턴스화 하지 않았는데도 호출이 됨! Wow
    num += 10
    println(num) // 20
    println(hello)
    println(fix)
//    fix = 5 // exception: Val cannot be resigned
//    println(fix)
}