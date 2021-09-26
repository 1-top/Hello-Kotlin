package coroutine.cancelandtimeout

import kotlinx.coroutines.*

/**
 * 이 예제는 코루틴이 취소되는데 협조직이지 못하다.
 * 따라서 job을 cancle하더라도 바로 종료되지 않는다.
 */
fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime
        var i = 0
        while (i < 5) {
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("job: I'm sleeping ${i++} ...")
                nextPrintTime += 500
            }
        }
    }
    delay(1000)
    println("main is starting")
    job.cancelAndJoin()
    println("main is quit")
}