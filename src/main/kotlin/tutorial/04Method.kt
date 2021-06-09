package tutorial

import java.lang.NullPointerException

/**
 * 함수 선언 방법
 * fun 함수명(변수명: 타입, 변수명: 타입 ...) : 반환타입 {
 *      내용...
 *      return 반환값
 * }
 */

//fun plus(first, second) { // Type을 명시하지 않으면 안되네
fun plus(first: Int, second: Int): Int {
    return first + second
}

fun plus(first: Int, second: Int?): Int {
    second ?: throw NullPointerException("hi null")
    return first + second!! // !! : null이 아니다라고 선언해주는 거!
}

/**
 * null safe operator: ?. -> null 일 경우에는 null을 반환함
 */
fun printUpperCase(str: String?) {
//    val msg = str.toUpperCase() // deprecated
//    val msg = str.uppercase() // error: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    val msg = str?.uppercase()
    println(msg)
}

/**
 * Elvis operator: ?: -> null일 경우 default값
 */
fun printLowerCase(str: String?) {
//    val msg = str?.lowercase() ?: "is null"
//    println(msg)
    println(str?.lowercase() ?: "is null")
}

/**
 * 리턴값이 있는 함수
 */
fun minus(num1: Int, num2: Int): Int {
    return num1 - num2
}

fun main() {
    println(plus(10, 20))
//    println(plus(10, null)) // NPE
    printUpperCase(null) // No exception..!
    printLowerCase(null) // is null
    val result1 = minus(10, 20)
    println(result1)
    val result2 = minus(num2 = 1, num1 = 10) // 매개변수를 직접 지정해줄 수 도 있네..!
    println(result2)
}