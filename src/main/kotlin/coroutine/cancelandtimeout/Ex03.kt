package coroutine.cancelandtimeout

import kotlinx.coroutines.*

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime
        var i = 0
        while (i < 5) {
            if (System.currentTimeMillis() >= nextPrintTime) {
                delay(1) // delay는 suspend function임으로 코루틴 종료에 협조적이게 된다.
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