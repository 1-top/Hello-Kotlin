package tutorial

fun main() {
    val car1 = Car("my_first_car", "black") // new 라는 keyword 를 사용하지 않는구나?!
    println(car1.name)
    car1.printInfo()
    car1.name = "change name"
    println(car1.name)
    println(car1.engine)
//    car1.color = "yellow" // error val이기 때문에
    val student1 = Student("stu1")
    student1.eat("Chicken", "Hamburger")

    val internalStudent = InternalStudent("Internal Student")
    println(internalStudent.name)
}

// Constructor 를 이렇게도 쓸 수 있네?! -> Primary Constructor 라고 한다네!
open class Car(var name: String, val color: String = "white") { // 앞에 var, val을 적어주지 않아도 에러는 없지만 값을 사용할 수가 없네
    // 끝에 쉼표 하나를 남겨 놓을 수도 있다! 이것을 Trailing comma 라고 한다네
    // open: Kotlin에서는 자바와 다르게 기본적으로 클래스와 메서드는 final이다!!
    // -> 따라서 상속 또는 오버라이드를 허용하려면 open 키워드를 붙여야한다.
    // 접근 제한자를 가지는 주생성자도 가질 수 있다!
    // -> class Car primary constructor(var name: String) { ... }

    //    var price: Long = 0 // 초기화를 안 해주면 에러가 나네
    private var price: Long // private를 이용해서 get, set 전부 사용 못하게 할 수 있고

    /**
     *  이렇게 getter를 수정할 수도 있네!, Kotlin에서는 private가 아니면 기본적으로 getter, setter를 만들어준다!!
     *  filed 라는 키워드로 this.engine 안 써도 된다?!
     */
    var engine: String
        //        get() { return "Engine is $field" } // return type을 적어주지 않아도 된다!
        get() = "Engine is $field" // = 으로도 만들 수 있다!
        private set // 이렇게 set을 숨길 수도 있다.

    init { // @PostConstructor 같은 거네?!
        println("생성자가 생성되기 이전에 동작!")
        price = 0L
        engine = "default engine"
    }

    // 이렇게도 생성자를 만들 수 있다. -> Secondary Constructor 라고 한다.
    constructor(name: String, color: String, price: Long) : this(name, color) { // 여기서는 val, var 입력할 수 없다!
        this.price = price
    }

    fun printInfo() {
        println("${this.name} ${this.color}")
    }

}

abstract class Person {
    abstract fun eat(vararg food: String)
    fun say() {
        println("Hello Kotlin")
    }
}

// Java에서 최상위 클래스가 Object였다면 Kotlin에서는 Any가 최상위 클래스이다.
// Java에서 마찬가지로 다중 상속이 불가하다!
class Student(private var name: String) : Person() { // extends 키워드를 사용하지 않고 콜론을 사용하네!
    override fun eat(vararg food: String) { // @Override를 사용 안 하네! 그리고 override 생략이 불가능하네?!
        food.forEach { println("${this.name} is eating $it") }
    }
//    override fun say() {} // open method가 아니라서 Override 불가능 하다!
}

// internal은 같은 모듈 내에서만 접근이 가능하다.
internal class InternalStudent(val name: String) {

}