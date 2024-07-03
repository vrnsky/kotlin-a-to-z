package me.vrnsky.chapter1

class SoftwareEngineer(val name: String, var company: String) {

    fun greeting(): String {
        return "Hello! My name is ${name}! I'm working at ${company}"
    }
}