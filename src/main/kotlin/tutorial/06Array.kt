package tutorial

/**
 * 배열 만드는 방법
 * var arr = arrayOf<Type>() // Type은 생략 가능하다.
 * e.g.) var arr = arrayOf<Int>(1, 2, 3, 4, 5)
 */

fun main() {
    var arr1 = arrayOf(1, 2, 3, 4, 5, "awesome")
    println(arr1[0]) // 1
    println(arr1.get(5)) // awesome
    println(arr1[0]) // 1
//    arr1.set(0, 10) // error: The integer literal does not conform to the expected type Nothing
    var arr2 = arrayOf<String>("test1", "hi", "hello", "kotlin")
    println(arr2[0]) // test1
    arr2.set(0, "Nice")
    println(arr2[0]) // NIce
    arr2[1] = "Great"
    println(arr2[1]) // Great

    // 방법 2.
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('a', 'b', 'c')
    val a3 = doubleArrayOf(1.2, 10.10)
    val a5 = booleanArrayOf(true, false, true)

    // 방법 3. lambda 활용
    val lambdaArr1 = Array(10, { 0 }) // size: 10, 0으로 10개 채워진다.
//    Array(5, { 1; 2; 3; 4; 5 })
    val lambdaArr2 = Array(5) { 1; 2; 3; 4; 5 } // 이렇게 밖으로 빼서 하기도 하네.
}