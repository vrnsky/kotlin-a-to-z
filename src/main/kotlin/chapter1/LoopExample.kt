package chapter1

fun main() {
    for (i in 0..10) {
        println("${i}-th iteration")
    }

    println("EXCLUSIVE LOOP EXAMPLE")

    for (i in 0 until 10) {
        println("${i}-th iteration")
    }
}