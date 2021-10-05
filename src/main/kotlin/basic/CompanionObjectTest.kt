package basic

import java.util.*

class Book private constructor(val id: String, val name: String) {
    companion object {
        val message = "Book is book" // (Java) @NotNull private static final String message = "Book is book";
        const val constMessage = "(Const Message) Book is book"  // (Java) @NotNull public static final String constMessage = "Const Message";
        private const val privateConstMessage = "(Private Const Message) Book is book" // (Java) private static final String privateConstMessage
        fun create(name: String) = Book(UUID.randomUUID().toString(), name)
    }
}

fun main() {
    val book1 = Book.create("book1").also { println("id: ${it.id} name: ${it.name}") }
    Book.message.also { println(it) }
}