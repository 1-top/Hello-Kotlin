package basic

fun main() {
    nullCheck()
    elvisOperationTest(null).also(::println)
    letTest("test@email.com")
    letTest(null)
    strNullTest(null).also(::println)
    strNullTest("harry").also(::println)
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

fun elvisOperationTest(str: String?) = str ?: "(ElvisOperationTest) String is null"

fun letTest(email: String?) {
    email?.let { println(it.uppercase()) } // email이 null이 아닐 경우에만 실행한다.
    email.let { println("그냥 let은 무조건 실행한다.") }
}

fun strNullTest(str: String?) = str?.uppercase() ?: "String is null"