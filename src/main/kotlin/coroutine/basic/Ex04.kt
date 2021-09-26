package coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// Structure concurrency
fun main() = runBlocking {
    val job = this.launch {
        delay(1000)
        println("World!")
    }
    println("Hello")
    // join 함수를 사용하지 않더라도 구조 안에 있는 실행문들이 모두 종료될 때까지 종료되지 않는다.
}
