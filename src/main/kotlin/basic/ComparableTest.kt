package basic

class Person2(val firstName: String, val lastName: String) : Comparable<Person2> {
    override fun compareTo(other: Person2): Int =
        compareValuesBy(this, other, Person2::firstName, Person2::lastName)
}

fun main() {
    val p1 = Person2("a", "c")
    val p2 = Person2("a", "b")
    p1.compareTo(p2).also(::println)
    println(p1 > p2)
    println(p1 < p2)
}