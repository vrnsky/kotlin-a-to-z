package me.vrnsky.io

class TestOutput(val gameMessages: MutableList<String>): Output {

    override fun messageUser(msg: String) {
        gameMessages.add(msg)
    }
}