package me.vrnsky.chapter2.feature

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class VehicleTest {

    @Test
    fun `When plus two vehicles it is sum of both`() {
        val lorry = Vehicle(100.00)
        val car = Vehicle(50.00)
        val sum = lorry + car
        Assertions.assertEquals(150.00, sum.capacity)
    }
}