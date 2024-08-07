package me.vrnsky.chapter2.oop

class Penguin: Bird() {
    override fun speak(): String {
        throw UnsupportedOperationException("I cannot speak!!!")
    }
}