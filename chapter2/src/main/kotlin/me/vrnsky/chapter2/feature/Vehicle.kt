package me.vrnsky.chapter2.feature

class Vehicle(val capacity: Double) {
    operator fun plus(other: Vehicle): Vehicle {
        return Vehicle(capacity + other.capacity)
    }
}