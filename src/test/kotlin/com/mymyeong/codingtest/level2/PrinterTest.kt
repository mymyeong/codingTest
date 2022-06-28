package com.mymyeong.codingtest.level2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PrinterTest {

    private val printer = Printer()

    @Test
    fun solution() {
        assertEquals(printer.solution(arrayListOf<Int>(2, 1, 3, 2).toIntArray(), 2), 1)
        assertEquals(printer.solution(arrayListOf<Int>(1, 1, 9, 1, 1, 1).toIntArray(), 0), 5)
    }
}