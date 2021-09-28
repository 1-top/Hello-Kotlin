package coroutine.compose

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(): Unit = runBlocking {
    measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY) { one() }
        val two = async(start = CoroutineStart.LAZY) { two() }
        one.start()
        two.start()
        // 만약 start()를 안 해준다면,
        // await 메서드가 호출될 때 메서드가 실행되기 때문에
        // one 메서드가 실행되고 종료 (1초) two 메서드가 실행되고 종료 (2초)로
        // 총 3초가 걸릴 것이다.
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