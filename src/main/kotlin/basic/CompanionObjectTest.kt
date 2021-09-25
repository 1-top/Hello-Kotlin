package basic

import java.util.*

class Book private constructor(val id: String, val name: String) {
    companion object {
        val message: String = "Book is book"
        fun create(name: String) = Book(UUID.randomUUID().toString(), name)
    }
}

fun main() {
    val book1 = Book.create("book1").also { println("id: ${it.id} name: ${it.name}") }
    Book.message.also { println(it) }
}