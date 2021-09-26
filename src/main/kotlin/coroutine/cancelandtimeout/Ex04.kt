package coroutine.cancelandtimeout

import kotlinx.coroutines.*

// yield를 사용하여 종료하는 방법.
fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        try {
            var nextPrintTime = startTime
            var i = 0
            while (i < 5) {
                if (System.currentTimeMillis() >= nextPrintTime) {
                    yield() // job이 종료될 때 exception 을 발생시킨다.
                    println("job: I'm sleeping ${i++} ...")
                    nextPrintTime += 500
                }
            }
        } catch (e: Exception) {
            println("$e")
        }
    }
    delay(1000)
    println("main is starting")
    job.cancelAndJoin()
    println("main is quit")
}