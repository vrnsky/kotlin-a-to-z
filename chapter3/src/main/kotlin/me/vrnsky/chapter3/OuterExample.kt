package me.vrnsky.chapter3

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}

fun main() {
    val out = Outer()
    println(out.Inner().getOuterReference().javaClass )
}