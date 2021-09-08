package tutorial

/**
 * 자료형
 * Kotlin은 모든 것이 객체이다. -> 타입도 객체이다. Java에서는 Wrapper 클래스였던 것이 여기선 기본적으로 타입이다.
 * null 타입을 체크하기 위해서 객체인 것 같다.
 * 정수형: Long > Int > Short > Byte
 * 실수형: Double > Float
 * 문자: Char
 * 문자열: String
 * 논리형: Boolean
 *
 * 자료형 표기 방법
 * ex) var num : Int = 20
 */

fun main() {
    var num = 10
    num = 20 // Ok Type을 적어주지 않아도 된다!
//    num = 3.14 // Nope: The floating-point literal does not conform to the expected type Int
    println(num)

//    var hello : String = "hello"
    var hello = "hello"
    val PI: Float = 3.14F // 뒤에 F를 붙여 줘야하네! 소문자 f도 되는 거 같아!
    println(PI)
}