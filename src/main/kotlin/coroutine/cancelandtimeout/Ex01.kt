package coroutine.cancelandtimeout

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = launch {
        repeat(1000) {
            println("job: $it")
            delay(500)
        }
    }
    delay(1300)
    println("main thread now start")
    job.cancel()
//    job.join() // job이 한번 종료되면
    println("main quit")
}