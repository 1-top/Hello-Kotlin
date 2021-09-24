package basic

import java.util.*

class Book private constructor(val id: String, val name: String) {
    companion object {
        fun create(name: String) = Book(UUID.randomUUID().toString(), name)
    }
}

fun main() {
    val book1 = Book.create("book1")
    println("id: ${book1.id} name: ${book1.name}")
}