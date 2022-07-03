package com.mymyeong.codingtest.level2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PrimeNumberTest {

    private val primeNumber = PrimeNumber()

    @Test
    fun solution() {
        assertEquals(primeNumber.solution("011"), 2)
        assertEquals(primeNumber.solution("17"), 3)
    }
}