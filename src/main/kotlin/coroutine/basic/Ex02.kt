package coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    GlobalScope.launch {
        delay(1000)
        println("World!")
    }
    println("Hello")
//    delay(1002)  // delay가 없으면 Hello만 찍히고 바로 종료된다.
}
