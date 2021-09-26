package coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    GlobalScope.launch {
        delay(1000)
        println("World!")
    }
    println("Hello")
//    Thread.sleep(2000) // Main Thread가 종료되지 않도록 잠시 멈춤. // Thread를 멈춘다.
    runBlocking { delay(2000) } // runBlocking 안에 있는 내용이 다 끝나기 전까지는 종료되지 않는다.
}