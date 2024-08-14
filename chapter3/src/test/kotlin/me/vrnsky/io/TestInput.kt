package me.vrnsky.io

class TestInput(val userMessages: List<String>, var counter: Int): Input {

    override fun askUser(msg: String): String {
        return userMessages[counter++]
    }
}