package coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    this.launch {
        repeat(5) {
            println("A: $it")
            delay(100)
        }
    }
    this.launch {
        repeat(5) {
            println("B: $it")
            delay(100)
        }
    }
    println("Coroutine outer")
}