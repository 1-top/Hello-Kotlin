package collections


fun main() {
    val people = listOf(
        Person("p1", 100, "teamA"),
        Person("p2", 200, "teamB"),
        Person("p3", 300, "teamA")
    )

    println("--------------------------- map, foreach")
    people.map { it.name } // List<String> 반환
        .forEach(::print).also { println() }

    println("--------------------------- joinToString")
    println(people.joinToString(separator = "-") { it.name })

    println("--------------------------- sumOf")
    println("Sum of cash: ${people.sumOf { it.cash }}")

    println("--------------------------- groupBy")
    val peopleGroupBy = people.groupBy { it.team } // Map<String, List<People>>
    peopleGroupBy.forEach { println(it) }

    println("--------------------------- filter")
    people.filter { it.team == "teamA" }.forEach { println(it) }

    println("--------------------------- reversed")
    people.reversed().forEach { println(it) }

    println("--------------------------- map")
    people.map { PersonDto(it.name, it.cash) }.forEach(::println)

    val numbers = mutableListOf("one", "two", "three")
    val countEndsWithE = numbers.run {
        add("four")
        add("five")
        count {it.endsWith("e")}
    }
    println(countEndsWithE)
}

data class Person(var name: String, var cash: Int, var team: String)

data class PersonDto(var name: String, var cash: Int)

