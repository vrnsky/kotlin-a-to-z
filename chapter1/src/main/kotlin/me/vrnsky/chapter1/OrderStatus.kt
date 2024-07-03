package me.vrnsky.chapter1

enum class OrderStatus(val readableName: String) {
    CREATED("Created"),
    CANCELLED("Cancelled"),
    EXECUTED("Executed");

    fun printStatus() {
        println("$this is $readableName")
    }
}