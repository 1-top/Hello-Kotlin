package basic

// lambda는 익명 함수다.
// method의 parameter로 넘겨줄 수 있다.
// return 값으로 사용할 수 있다.
fun main() {
    println(square(10))
//    println("abc".pizzaIsGreat())
    println(twoStringTypeInference("one", "two"))
    println("abc".pizzaIsGreat("Hello", "World"))
    println(invokeFunc({ "Hello $it" }, "Harry"))
    simpleInvokeFunc { println("Hello simple lambda") }
}

//val square: (Int) -> Int = { num: Int -> num * num }
//val square: (Int) -> Int = { num -> num * num } // parameter 부분은 항상 괄호()를 써야한다. but. return에서는 생략!
val square = { num: Int -> num * num } // 타입추론 (type inference)

//val twoString: (String, String) -> String = { s1: String, s2: String ->
//    print("Hello two params")
//    "$s1 $s2"
//}

//val twoString: (String, String) -> String = {s1, s2 ->
//    println("$s1 $s2")
//    "s1 s2"
//}

val twoString = { s1: String, s2: String -> "$s1 $s2" }

val twoStringTypeInference = { s1: String, s2: String ->
    println("Hello two params and type inference")
    "$s1 $s2"
}

// 확장 함수
//val pizzaIsGreat: String.() -> String = {"$this Pizza is the best"}
val pizzaIsGreat: String.(String, String) -> String = { s1: String, s2: String ->
    "$this $s1 $s2 Pizza is the best"
}

// 매개변수로 함수를 받는 람다함수
val invokeFunc = { func: (String) -> String, str: String ->
    println("invokeFunc 실행됨.")
    func(str)
}

val simpleInvokeFunc = { func: () -> Unit -> func.invoke() }