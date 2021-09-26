package coroutine.compose

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 * 비동기적으로 처리하고 값을 기다렸다가 사용한다.
 * 따라서 가장 오래 걸리는 시간인 two가 끝나는 시간만큼 걸린다. (2초)
 */
fun main(): Unit = runBlocking {
    measureTimeMillis {
        val one = async { one() }
        val two = async { two() }
        println("one + two is ${one.await() + two.await()}")
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