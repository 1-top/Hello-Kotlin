package coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = GlobalScope.launch {
        delay(1000)
        println("World!")
    }
    println("Hello")
    job.join() // job 이 완료될 때 까지 기다린다.
    // 단점.
    // job이 생길 때 마다 join함수를 호출해줘야 하는 불편함이 존재한다.
}
