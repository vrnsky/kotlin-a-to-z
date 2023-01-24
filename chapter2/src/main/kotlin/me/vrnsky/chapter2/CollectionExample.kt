package me.vrnsky.chapter2

fun main() {
    val exampleOfSet = setOf(1, 2, 3)
    println(exampleOfSet.last())
    println(exampleOfSet.sum())

    val exampleOfList = listOf(3,2,1)
    println(exampleOfList.first())
    println(exampleOfList.sum())
    println(exampleOfList.joinToString(separator = ",", prefix = "(", postfix = ")"))

    val exampleOfMap = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    val (a, b) = 1 to "Space"
    println("$a $b")
    println(exampleOfMap[1])
}