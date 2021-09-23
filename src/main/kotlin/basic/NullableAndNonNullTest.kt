package basic

fun main() {
    nullCheck()
    elvisOperationTest()
    letTest("test@email.com")
    letTest(null)
}

fun nullCheck() {
    var name = "harry"
//    var nullName: String = null // (error) non-null Type으로 null로 초기화할 수 없다!
    var nullName: String? = null // type 생략 불가능

    val nameUpperCase = name.uppercase()
//     val nullNameUpperCase = nullName.uppercase() // -> Runtime 시에 NPE가 발생되는 것이 아니라 Compile 이전에 에러를 체크해준다!
    val nullNameUpperCase = nullName?.uppercase() // null일 경우에는 null 반환.
    println(nullNameUpperCase)
}

fun elvisOperationTest() {
    var name: String? = null
//    var name: String? = "Harry"
    val str = name?: "name is null" // null일 경우에 name is null 반환.
    println(str)
}

fun letTest(email: String?) {
    email?.let { println(it.uppercase()) } // email이 null이 아닐 경우에만 실행한다.
    email.let { println("그냥 let은 무조건 실행한다.")}
}