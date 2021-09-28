package coroutine.cancelandtimeout

import kotlinx.coroutines.*

// isActive 를 사용하는 방법
fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime
        var i = 0
        while (isActive) {
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

/**
 * Dispatchers.Unconfined: will work with main thread
 * Dispatchers.Default: will get dispatched to DefaultDispatcher - GlobalScope 사용한 결과와 같다.
 * newSingleThreadContext(): will get its own new thread
 */