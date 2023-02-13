package com.mymyeong.codingtest.brandi

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RpsTest {

    @Test
    fun getWinners() {
//        assertEquals(Rps().getWinners(5, listOf("P", "S", "P", "R", "S", "S")), listOf(0, 2))
        assertEquals(Rps().getWinners(5, listOf("P", "S", "P", "R", "S")), listOf(3))
//        assertEquals(Rps().getWinners(-2, listOf("S", "S", "R", "R", "S", "S")), listOf(0, 1, 4, 5))
    }
}