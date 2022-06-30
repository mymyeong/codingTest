package com.mymyeong.codingtest.level2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MaxNumberTest {

    private val maxNumber = MaxNumber()

    @Test
    fun solution() {
        assertEquals(maxNumber.solution(arrayListOf<Int>(6, 10, 2).toIntArray()), "6210")
        assertEquals(maxNumber.solution(arrayListOf<Int>(3, 30, 34, 5, 9).toIntArray()), "9534330")
    }
}