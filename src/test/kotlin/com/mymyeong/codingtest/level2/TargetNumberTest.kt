package com.mymyeong.codingtest.level2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TargetNumberTest {

    private val targetNumber = TargetNumber()
    @Test
    fun solution() {
        assertEquals(targetNumber.solution(arrayOf(1, 1, 1, 1, 1).toIntArray(), 3), 5)
        assertEquals(targetNumber.solution(arrayOf(4, 1, 2, 1).toIntArray(), 4), 2)
    }
}