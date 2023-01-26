package me.vrnsky.chapter5

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    println(list.filter { it % 2 == 0 })

    println(list.map { it * it })

    val exampleOf = mapOf(1 to "one", 2 to "two")
    println(exampleOf.map { it.value.uppercase() })

    val people = listOf(
        Person("Aleksei", 29),
        Person("Natalia", 28)
    )
    val folded = people.fold("Kotlin") { acc, person ->
        acc + person.name
    }
    println(folded)

    val moreThan25 = people
        .asSequence()
        .filter { it.age > 25 }
        .toList()
    println("More than 25  $moreThan25")

    val chunkExample = listOf(2, 2, 4, 4, 6, 6)
    println(chunkExample.chunked(2) { it.sum() / 2 })

    val names = listOf("Egor", "Kate")
    val ages = listOf(26, 24)

    println(names.zip(ages))
}