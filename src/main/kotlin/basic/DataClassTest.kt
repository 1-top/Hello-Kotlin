package basic
/*
* data class
*   특징
*       - Canonical method를 자동으로 overriding 해준다.
*       - Canonical method란 Any클래스에 있는 methods를 말한다. (equals, hashCode, toString, copy)
*   제한 사항
*       - 기본 생성자에는 최소 하나의 파라미터가 있어야 한다.
*       - 그 기본 생성자의 파라미터는 val 또는 var 이어야 한다.
*       - abstract, open, sealed, inner가 되면 안된다.
* */
data class Member(val name: String, var phoneNumber: String) {
    var address: String? = null // 생성자에서 만들어지지 않는다면, equals, hashcode, tosString에 재정의되지 않는다.
}


fun main() {
    val member1 = Member("member1", "010-0000-1234")
    println("$member1.name ${member1.phoneNumber}")
    println(member1)
}