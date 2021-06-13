package tutorial

import java.util.function.UnaryOperator

/**
 * Collection
 * List, Set, Map
 * List, Set -> extends Collection
 * Set: 중복X, 순서X
 */

fun main() {
    // 값을 변경할 수 없는 Collection
    val numList = listOf<Int>(1, 2, 3)
//    numList[0] = 10 // 변경할 수 없음. Immutable Collection이기 때문이다.
    println(numList)

//    val numSet = setOf<Int>(1, 2, 3, 3, 3)
    val numSet = setOf(1, 2, 3, 3, 3) // <Int>를 생략해도 가능하다
    println(numSet)

    val map1 = mapOf<String, Int>("one" to 1, "two" to 2)
    val numMap = mapOf<Int, Array<Int>>()
//    numMap[1] = arrayOf(1, 2, 3) // 값을 추가하거나 변경할 수 없음.

    // 값을 변경할 수 있는 Collection: Mutable
    val mutableList = mutableListOf<Int>()
//    val mutableList = mutableListOf() // <Int>를 생략할 수 없다.
    mutableList.add(1) // [1]
    mutableList.add(2) // [1, 2]
//    mutableList[1] = 2 // 이런 식으로도 값을 넣을 수 있지만 값이 없는 index에는 IndexOutOfBoundsException이 발생한다.
    println("mutableList: $mutableList")
    mutableList.add(0, 10) // index, element -> 0번째 index를 10을 삽입한다.
    println("mutableList: $mutableList") // [10, 1, 2]
    mutableList.removeAt(0) // [1, 2] 해당하는 index를 지운다.
    mutableList.remove(2) // [1]  해당하는 element를 지운다.
    println("mutableList: $mutableList")

    val mutableMap = mutableMapOf<String, Int>()
    mutableMap.put("One", 1)
    mutableMap["Two"] = 1 // 이런 식으로도 가능하다!
    println(mutableMap) // {One=1, Two=1}
    mutableMap.replace("One", 11)
}