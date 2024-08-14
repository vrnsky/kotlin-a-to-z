package me.vrnsky.io.console

import me.vrnsky.io.Input

class ConsoleInput: Input {

    override fun askUser(msg: String): String {
        println(msg)
        return readLine()!!
    }
}