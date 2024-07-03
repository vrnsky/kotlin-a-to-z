package me.vrnsky.chapter1

class Calculator {

    fun add(a: Int, b: Int) = a + b
    fun subtract(a: Int, b: Int) = a - b
    fun divide(a: Int, b: Int): Int {
        if (b == 0) {
            throw IllegalArgumentException("Division by zero")
        }
        return a / b
    }
    fun multiply(a: Int, b: Int) = a * b
}