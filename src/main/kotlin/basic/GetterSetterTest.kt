package basic


class Person(name: String) {
    // 클래스의 멤버 변수는 모두 private 접근 제한자로 지정된다!
    // 따라서 그냥 person.name 으로 public하게 접근하는 것 같지만,
    // 모두 getter와 setter를 통해 접근하고 있는 것이다!
    var name = name
        private set // setName만 private 하고 싶을 경우!!
        get() = "My name is $field"

    var phoneNumber: String? = null
        set(value) {
            field = "(tel) $value"
        }

    constructor(name: String, phoneNumber: String) : this(name) {
        this.phoneNumber = phoneNumber
    }

}

fun main() {
    val person = Person("good")
    println(person.name) // 필드를 다이렉트로 호출하는 것 같지만, 내부적으로 getName을 호출한다!
    person.phoneNumber = "010-1234-1234" // 필드를 직접 변경 하는 것 같지만, 내부적으로 setName 실행됨!
    println(person.phoneNumber)
}