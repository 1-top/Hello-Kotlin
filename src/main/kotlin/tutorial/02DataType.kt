package tutorial

/**
 * 자료형
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

    var hello : String = "hello"
    val PI : Float = 3.14F // 뒤에 F를 붙여 줘야하네! 소문자 f도 되는 거 같아!
    println(PI)
}