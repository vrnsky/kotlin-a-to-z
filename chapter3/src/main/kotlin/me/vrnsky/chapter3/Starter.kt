package me.vrnsky.chapter3

fun main() {
    val button = Button()
    button.showOff()
    button.click()

    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Test")
    println(lengthCounter.counter)

    CompanionExample.callMe()
}