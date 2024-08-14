package me.vrnsky.io.console

import me.vrnsky.io.Output

class ConsoleOutput: Output {

    override fun messageUser(msg: String) {
        println(msg)
    }
}