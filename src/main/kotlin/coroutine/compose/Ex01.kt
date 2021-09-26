package coroutine.compose

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 * 일반적인 코드 블락처럼 동작한다. -> 비동기가 아니라 순차적으로 동작한다.
 * 따라서 총 시간은 3초가 걸리게 된다.
 */
fun main(): Unit = runBlocking {
    measureTimeMillis {
        val one = one()
        val two = two()
        println("one + two is ${one + two}")
    }.also { println("Completed time is $it") }
}

private suspend fun one(): Int {
    delay(1000)
    return 1
}

private suspend fun two(): Int {
    delay(2000)
    return 2
}