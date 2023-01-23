package chapter1

fun main() {
    val input = readln();
    val name = input.ifBlank { "Kotlin" }
    println("Hello, $name")
    var egor = Person("Egor", 26)
    egor.age = 25
}