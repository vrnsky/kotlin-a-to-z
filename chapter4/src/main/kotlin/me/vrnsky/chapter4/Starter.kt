package me.vrnsky.chapter4

fun main() {
    val persons = listOf(Person("Egor", 26), Person("Kate", 24))
    val oldestPerson = persons.maxByOrNull { it.age }
    val youngestPerson = persons.minByOrNull(Person::age)
    println(oldestPerson)
    println(youngestPerson)

    val multiply = { x: Int, y: Int -> x * y }
    println(multiply(1, 3))

    fun salute() = println("salute")
    run(::salute)
}