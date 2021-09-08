package tutorial

fun main() {
    var a = "1"
    val b = a.toInt() // Int로 형변환
    val c = "Hello $b" // $를 쓰면 String 안에 변수 넣을 수 있네!

//    var nullTest1 : Int = null // Null can not be a value of a non-null type Int
    var nullTest2: Int? = null // ?를 붙이면 null을 가질 수 있음!
    var nullTest3 = null // type을 적지 않아도 null이 가능하네
    var nullTest4: Nothing? = null // Nothing 이란 것도 있네
//    var nullTest5 = nullTest3 ?: throw IllegalStateException("null이다!")
    println(nullTest2)
    println(nullTest3)
//    println(nullTest5)

    // Elvis operator
    val obj1: Any? = null
    val obj2 = obj1 ?: "hi"
    println(obj2)

}